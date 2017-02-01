package android.vm.ardudodo.models;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;


/**
 * Created by andrea on 31/01/17.
 */

public class Kitchen extends Room{
    private boolean cucina, cucinaBox, corridoio;
    private int tapCucina, temperatura, umidita;

    public Kitchen(JSONArray jsonValue) {
        //Log.d("VALUE JSON",jsonValue.toString());
        try {
            this.cucina = (jsonValue.getInt(CUCINA)!=0);
            this.cucinaBox = (jsonValue.getInt(CUCINA_BOX)!=0);
            this.corridoio = (jsonValue.getInt(CORRIDOIO)!=0);
            this.tapCucina = jsonValue.getInt(TAP_CUCINA);
            this.temperatura = jsonValue.getInt(TEMPERATURA);
            this.umidita = jsonValue.getInt(UMIDITA);
        } catch (JSONException e) {
            e.printStackTrace();
        }

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


    @Override
    public <T extends Room> Room getInstance(JSONArray jsonArray) {
        return new Kitchen(jsonArray);
    }
}
