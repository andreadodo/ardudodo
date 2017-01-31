package android.vm.ardudodo.models;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;

import static android.vm.ardudodo.models.HouseIndex.*;

/**
 * Created by andrea on 31/01/17.
 */

public class Kitchen {
    private boolean cucina, cucinaBox, corridoio;
    private int tapCucina, temperatura, umidita;

    public Kitchen(JSONArray jsonValue) throws JSONException {

        //Log.d("VALUE JSON",jsonValue.toString());

        this.cucina = jsonValue.getBoolean(CUCINA);
        this.cucinaBox = jsonValue.getBoolean(CUCINA_BOX);
        this.corridoio = jsonValue.getBoolean(CORRIDOIO);
        this.tapCucina = jsonValue.getInt(TAP_CUCINA);
        this.temperatura = jsonValue.getInt(TEMPERATURA);
        this.umidita = jsonValue.getInt(UMIDITA);
    }

    public boolean getCucina() {
        return cucina;
    }
    public void setCucina(boolean cucina) {
        this.cucina = cucina;
    }

    public boolean getCucinaBox() {
        return cucinaBox;
    }
    public void setCucinaBox(boolean cucinaBox) {
        this.cucinaBox = cucinaBox;
    }

    public boolean getCorridoio() {
        return corridoio;
    }
    public void setCorridoio(boolean corridoio) {
        this.corridoio = corridoio;
    }

    public int getTapCucina() {
        return tapCucina;
    }
    public void setTapCucina(int tapCucina) {
        this.tapCucina = tapCucina;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setUmidita(int umidita) {
        this.umidita = umidita;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getUmidita() {
        return umidita;
    }
}
