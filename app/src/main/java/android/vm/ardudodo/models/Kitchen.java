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

    public Kitchen(JSONArray jsonValue) {

        Log.d("VALUE JSON",jsonValue.toString());

        Integer[] value = new Integer[jsonValue.length()];

        for (int i = 0; i < jsonValue.length(); i++) {
            try {
                value[i] = jsonValue.getInt(i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < value.length; i++)
            Log.d("VALUE [" + i + "]", String.valueOf(value[i]));

        this.cucina = (value[CUCINA] != 0);
        this.cucinaBox = (value[CUCINA_BOX] != 0);
        this.corridoio = (value[CORRIDOIO] != 0);
        this.tapCucina = value[TAP_CUCINA];
        this.temperatura = value[TEMPERATURA];
        this.umidita = value[UMIDITA];
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
}
