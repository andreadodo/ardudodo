package android.vm.ardudodo.controllers;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;


/**
 * Created by andrea on 30/01/17.
 */

public class ValueActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fetchDataFromUdoo();
      //  Log.d("")

    }

    private void fetchDataFromUdoo() {

        //Init request queque
        RequestQueue queue = Volley.newRequestQueue(this);
        //String url = "http://www.mocky.io/v2/588b5b94300000411cfa8dd0";
        String url = "http://172.16.9.150:8888/ardudodo.php";

        //Request a string response from the URL
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
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

                        Integer[] value = new Integer[jsonArray.length()];

                        for (int i = 0; i < jsonArray.length(); i++) {
                            try {
                                value[i] = jsonArray.getInt(i);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                        for (int i = 0; i < value.length; i++)
                            Log.d("VALUE [" + i + "]", String.valueOf(value[i]));
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
