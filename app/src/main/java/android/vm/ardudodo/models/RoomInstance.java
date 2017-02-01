package android.vm.ardudodo.models;

/**
 * Created by andrea on 01/02/17.
 */

public class RoomInstance<K> extends Room {

    public static  <K extends RoomInstance> K newInsance(K k){
        try {
            return (K)k.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
