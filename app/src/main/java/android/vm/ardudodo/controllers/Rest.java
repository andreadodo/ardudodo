package android.vm.ardudodo.controllers;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.vm.ardudodo.models.Kitchen;
import android.vm.ardudodo.models.Room;
import android.vm.ardudodo.models.RoomInstance;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import static android.vm.ardudodo.models.Room.URL;

/**
 * Created by andrea on 01/02/17.
 */


public class Rest extends Activity {
    Context context;

    public Rest(Context c) {
        context = c;
    }

    public interface ResponseCallback<R extends Room> {
        void onSuccess(R room);

        void onError(String message);
    }

    public <K> void requestUdoo(int id, int cmd, final ResponseCallback<K> callback) {

        //Init request queque
        RequestQueue queue = Volley.newRequestQueue(context);

        final JsonArrayRequest jsonRequest = new JsonArrayRequest(
                //URL + ID + CMD
                URL + "?id=" + String.valueOf(id) + "&cmd=" + String.valueOf(cmd),

                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d("JSON", response.toString());
                        K room = RoomInstance.newInsance(Class<K> K.);

                        // .getInstance(response);
                        //callback.onSuccess(room);

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

