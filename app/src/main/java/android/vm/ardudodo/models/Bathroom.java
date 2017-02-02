package android.vm.ardudodo.models;

import org.json.JSONArray;
import org.json.JSONException;

import static android.vm.ardudodo.models.Room.*;


/**
 * Created by andrea on 31/01/17.
 */

public class Bathroom {
    private boolean bagno, wc, lavabo, ventola;

    public Bathroom(JSONArray jsonArray) {
        try {
            this.bagno = (jsonArray.getInt(BAGNO)!=0);
            this.wc = (jsonArray.getInt(WC)!=0);
            this.lavabo = (jsonArray.getInt(LAVABO)!=0);
            this.ventola = (jsonArray.getInt(VENTOLA)!=0);
        } catch (JSONException e) {
            e.printStackTrace();
        }

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
}
