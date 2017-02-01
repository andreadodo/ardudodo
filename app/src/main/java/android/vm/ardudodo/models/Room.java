package android.vm.ardudodo.models;

import android.vm.ardudodo.R;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by andrea on 01/02/17.
 */

public abstract class Room <R extends Room>{

//    public K newInstance (JSONArray jsonArray) {
//        return new K
//    }

    public  Room<R> getInstance(R r,JSONArray jsonArray){
        try {
            return r.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }

    //WEB
    public static final String URL = "http://172.16.9.150:8888/ardudodo.php";

    // PACCHETTO
    public static final int START = 0;
    public static final int CUCINA = 1;
    public static final int CUCINA_BOX = 2;
    public static final int CORRIDOIO = 3;
    public static final int LETTO = 4;
    public static final int COMODINO_DX = 5;
    public static final int COMODINO_SX = 6;
    public static final int CAMERETTA = 7;
    public static final int BAGNO = 8;
    public static final int WC = 9;
    public static final int LAVABO = 10;
    public static final int VENTOLA = 11;
    public static final int CORTESIA = 12;
    public static final int TAP_CUCINA = 13;
    public static final int TAP_LETTO_SX = 14;
    public static final int TAP_LETTO_DX = 15;
    public static final int TAP_CAMERETTA = 16;
    public static final int TEMPERATURA = 17;
    public static final int UMIDITA = 18;
    public static final int LUMINOSITA = 19;
    public static final int ERROR_I2C = 20;
    public static final int HH_GIORNO = 21;
    public static final int MM_GIORNO = 22;
    public static final int INT_GIORNO = 23;
    public static final int HH_NOTTE = 24;
    public static final int MM_NOTTE = 25;
    public static final int INT_NOTTE = 26;
    public static final int MM_VENTOLA = 27;
    public static final int SS_VENTOLA = 28;
    public static final int GG_DATA = 29;
    public static final int MM_DATA = 30;
    public static final int AA_DATA = 31;
    public static final int HH_ORA = 32;
    public static final int MM_ORA = 33;
    public static final int SS_ORA = 34;
    public static final int STOP = 35;


}
