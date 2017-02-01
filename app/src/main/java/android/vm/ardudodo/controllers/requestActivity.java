package android.vm.ardudodo.controllers;

import android.app.Activity;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import static android.vm.ardudodo.models.HouseIndex.*;

/**
 * Created by andrea on 01/02/17.
 */

public class requestActivity extends Activity{


    public interface callBack{

    };

    private void fetchDataFromUdoo(int id, int cmd) {

        //Init request queque
        RequestQueue queue = Volley.newRequestQueue(this);

        JsonArrayRequest jsonRequest = new JsonArrayRequest(
                //URL + ID + CMD
                URL + "?id=" + String.valueOf(id) + "&cmd=" + String.valueOf(cmd),

                new Response.Listener<JSONArray>(){
                    @Override
                    public void onResponse(JSONArray response){
                        Log.d("JSON", response.toString());
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
        queue.add(jsonRequest);
    }
}






