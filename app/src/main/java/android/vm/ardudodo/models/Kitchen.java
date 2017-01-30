package android.vm.ardudodo.models;

import android.graphics.LightingColorFilter;

/**
 * Created by andrea on 30/01/17.
 */

public class Kitchen {
    private boolean cucina,
                    cucinaBox,
                    corridoio;

    private int tapCucina,
                temperatura,
                umidita;

    public Kitchen(boolean cucina, boolean cucinaBox, boolean corridoio, int tapCucina, int temperatura, int umidita) {
        this.cucina = cucina;
        this.cucinaBox = cucinaBox;
        this.corridoio = corridoio;
        this.tapCucina = tapCucina;
        this.temperatura = temperatura;
        this.umidita = umidita;
    }

    public boolean isCucina() {
        return cucina;
    }

    public boolean isCucinaBox() {
        return cucinaBox;
    }

    public int getTapCucina() {
        return tapCucina;
    }

    public boolean isCorridoio() {
        return corridoio;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getUmidita() {
        return umidita;
    }
}
