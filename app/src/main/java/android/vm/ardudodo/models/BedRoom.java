package android.vm.ardudodo.models;

import org.json.JSONArray;
import org.json.JSONException;


/**
 * Created by andrea on 30/01/17.
 */

public class Bedroom extends Room{
    private boolean letto, comodinoDx, comodinoSx;
    private int tapLettoDx, tapLettoSx;

    public Bedroom(JSONArray jsonArray) throws JSONException {

        this.letto = (jsonArray.getInt(LETTO) != 0);
        this.comodinoDx = (jsonArray.getInt(COMODINO_DX) != 0);
        this.comodinoSx = (jsonArray.getInt(COMODINO_SX) != 0);
        this.tapLettoDx = jsonArray.getInt(TAP_LETTO_DX);
        this.tapLettoSx = jsonArray.getInt(TAP_LETTO_SX);
    }

    public boolean getLetto() {
        return letto;
    }
    public boolean getComodinoDx() {
        return comodinoDx;
    }
    public boolean getComodinoSx() {
        return comodinoSx;
    }
    public int getTapLettoDx() {
        return tapLettoDx;
    }
    public int getTapLettoSx() {
        return tapLettoSx;
    }

    @Override
    public <T extends Room> Room getInstance(JSONArray jsonArray) {
        return new Kitchen(jsonArray);

    }
}
