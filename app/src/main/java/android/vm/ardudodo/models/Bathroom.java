package android.vm.ardudodo.models;

import org.json.JSONArray;
import org.json.JSONException;


/**
 * Created by andrea on 31/01/17.
 */

public class Bathroom extends RoomInstance{
    private boolean bagno, wc, lavabo, ventola;

    @Override
    public void setData(JSONArray jsonValue) {
        //Log.d("VALUE JSON",jsonValue.toString());
        try {
            this.bagno = (jsonArray.getInt(BAGNO)!=0);
            this.wc = (jsonArray.getInt(WC)!=0);
            this.lavabo = (jsonArray.getInt(LAVABO)!=0);
            this.ventola = (jsonArray.getInt(VENTOLA)!=0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public Bathroom(JSONArray jsonArray) { }

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

   /* @Override
    public <T extends Room> Room getInstance(JSONArray jsonArray) throws JSONException {
        return new Bathroom(jsonArray);

    }*/
}
