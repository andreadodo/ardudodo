package android.vm.ardudodo.models;

import org.json.JSONArray;
import org.json.JSONException;


/**
 * Created by andrea on 01/02/17.
 */

public class Settings extends Room{
    private String oraGiorno, oraNotte, oraVentola, ora, data;
    private int intGiorno, intNotte,lux, i2c;

    public Settings(JSONArray jsonArray) throws JSONException {

        this.oraGiorno = jsonArray.getString(HH_GIORNO)+":"+jsonArray.getString(MM_GIORNO);
        this.oraNotte = jsonArray.getString(HH_NOTTE)+":"+jsonArray.getString(MM_NOTTE);
        this.oraVentola = jsonArray.getString(MM_VENTOLA)+":"+jsonArray.getString(SS_VENTOLA);
        this.ora = jsonArray.getString(HH_ORA)+":"+jsonArray.getString(MM_ORA)+":"+jsonArray.getString(SS_ORA);
        this.data = jsonArray.getString(GG_DATA)+"/"+jsonArray.getString(MM_DATA)+"/"+jsonArray.getString(AA_DATA);
        this.intGiorno = jsonArray.getInt(INT_GIORNO);
        this.intNotte = jsonArray.getInt(INT_NOTTE);
        this.i2c = jsonArray.getInt(ERROR_I2C);
        this.lux = jsonArray.getInt(LUMINOSITA);
    }

    public String getOraGiorno() {
        return oraGiorno;
    }
    public String getOraNotte() {
        return oraNotte;
    }

    public String getOraVentola() {
        return oraVentola;
    }

    public String getOra() {
        return ora;
    }
    public String getData() {
        return data;
    }

    public int getIntGiorno() {
        return intGiorno;
    }
    public int getIntNotte() {
        return intNotte;
    }

    public int getLux() {
        return lux;
    }
    public int getI2c() {
        return i2c;
    }

    @Override
    public <T extends Room> Room getInstance(JSONArray jsonArray) throws JSONException {
        return new Settings(jsonArray);
    }
}
