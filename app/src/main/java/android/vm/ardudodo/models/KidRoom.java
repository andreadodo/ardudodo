package android.vm.ardudodo.models;

import org.json.JSONArray;
import org.json.JSONException;

import static android.vm.ardudodo.models.HouseIndex.*;

/**
 * Created by andrea on 31/01/17.
 */

public class KidRoom {
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
}
