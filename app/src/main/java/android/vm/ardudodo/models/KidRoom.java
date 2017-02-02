package android.vm.ardudodo.models;

import org.json.JSONArray;
import org.json.JSONException;


/**
 * Created by andrea on 31/01/17.
 */

public class Kidroom extends Room{
    private boolean cameretta;
    private int tapCameretta;

    public Kidroom(JSONArray jsonValue) {
        //Log.d("VALUE JSON",jsonValue.toString());
        try {
            this.cameretta = (jsonValue.getInt(CAMERETTA)!=0);
            this.tapCameretta = jsonValue.getInt(TAP_CAMERETTA);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public boolean getCameretta() {
        return cameretta;
    }
    public int getTapCameretta() {
        return tapCameretta;
    }

   /* @Override
    public <T extends Room> Room getInstance(JSONArray jsonArray) {
        return new Kitchen(jsonArray);

    }*/
}
