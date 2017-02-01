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
    private int id, cmd;

    public requestActivity(int id, boolean cmd) {
        if(id>100&&id<200) {
            this.id=id+100; //-100+200
            if(cmd == true) this.cmd = ON;
            else if(cmd == false) this.cmd = OFF;
        }
        fetchDataFromUdoo(this.id, this.cmd);
    }


    public requestActivity(int id, int cmd) {
        if (id>200&&id<300) {
            this.id = id; //-200+200
            if (cmd >= 0 && cmd <= 100)
                this.cmd = cmd + 100;
        }
        fetchDataFromUdoo(this.id, this.cmd);
    }

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





