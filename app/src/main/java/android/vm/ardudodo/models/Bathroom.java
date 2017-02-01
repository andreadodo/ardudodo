package android.vm.ardudodo.models;

import org.json.JSONArray;
import org.json.JSONException;


/**
 * Created by andrea on 31/01/17.
 */

public class Bathroom extends Room{
    private boolean bagno, wc, lavabo, ventola;

    public Bathroom(JSONArray jsonArray) throws JSONException {
        this.bagno = (jsonArray.getInt(BAGNO)!=0);
        this.wc = (jsonArray.getInt(WC)!=0);
        this.lavabo = (jsonArray.getInt(LAVABO)!=0);
        this.ventola = (jsonArray.getInt(VENTOLA)!=0);
    }

    public boolean getBagno() {
        return bagno;
    }
    public boolean getWc() {
        return wc;
    }
    public boolean getLavabo() {
        return lavabo;
    }
    public boolean getVentola() {
        return ventola;
    }

    @Override
    public <T extends Room> Room getInstance(JSONArray jsonArray) throws JSONException {
        return new Bathroom(jsonArray);

    }
}
