package android.vm.ardudodo.models;

import org.json.JSONArray;
import org.json.JSONException;


/**
 * Created by andrea on 31/01/17.
 */

public class KidRoom extends Room{
    private boolean cameretta;
    private int tapCameretta;

    public KidRoom(JSONArray jsonValue) throws JSONException {
        this.cameretta = (jsonValue.getInt(CAMERETTA)!=0);
        this.tapCameretta = jsonValue.getInt(TAP_CAMERETTA);
    }

    public boolean getCameretta() {
        return cameretta;
    }
    public int getTapCameretta() {
        return tapCameretta;
    }

    @Override
    public <T extends Room> Room getInstance(JSONArray jsonArray) {
        return new Kitchen(jsonArray);

    }
}
