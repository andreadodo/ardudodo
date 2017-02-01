package android.vm.ardudodo.controllers;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import static android.vm.ardudodo.models.HouseIndex.URL;


/**
 * Created by andrea on 31/01/17.
 */

public class NewValueActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fetchDataFromUdoo();
        //  Log.d("")

    }

    private void fetchDataFromUdoo() {

        //Init request queque
        RequestQueue queue = Volley.newRequestQueue(this);

        //Request a string response from the URL
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL,
                new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response){
                        JSONArray jsonArray = null;

                        Log.d("READ", response);
                        try {
                            jsonArray = new JSONArray(response);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        Log.d("JSON",jsonArray.toString());
                    }
                },

                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("ERROR", error.getMessage());
                    }
                }
        );

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}
