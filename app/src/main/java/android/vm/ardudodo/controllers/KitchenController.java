package android.vm.ardudodo.controllers;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.vm.ardudodo.models.Kitchen;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import static android.vm.ardudodo.models.Room.URL;

/**
 * Created by andrea on 02/02/17.
 */

public class KitchenController extends Activity {
    Context context;

    public KitchenController(Context c) {
        context = c;
    }


    public void fetchDataFromUdoo(int id, int cmd, final Rest.ResponseCallback<Kitchen> callback) {

        //Init request queque
        RequestQueue queue = Volley.newRequestQueue(context);

        JsonArrayRequest jsonRequest = new JsonArrayRequest(
                //URL + ID + CMD
                URL + "?id=" + String.valueOf(id) + "&cmd=" + String.valueOf(cmd),

                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d("JSON", response.toString());
                        callback.onSuccess(new Kitchen(response));

                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("ERROR", error.getMessage());
                        callback.onError(error.getMessage());
                    }
                }
        );

        // Add the request to the RequestQueue.
        queue.add(jsonRequest);
    }
}
