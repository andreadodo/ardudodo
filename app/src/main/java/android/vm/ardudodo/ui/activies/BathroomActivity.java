package android.vm.ardudodo.ui.activies;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.vm.ardudodo.R;
import android.vm.ardudodo.controllers.BathRoomController;
import android.vm.ardudodo.controllers.Rest;
import android.vm.ardudodo.models.Bathroom;
import android.widget.CompoundButton;
import android.widget.Switch;

/**
 * Created by User on 27/01/2017.
 */

public class BathroomActivity extends Activity {
    Switch switchBagno, switchWc, swithLavabo, switchVentola;

    @Override
    protected void onStart() {
        super.onStart();
        new BathRoomController(this).fetchDataFromUdoo(0, 0,
                new Rest.ResponseCallback<Bathroom>() {
                    @Override
                    public void onSuccess(Bathroom room) {
                        switchBagno.setChecked(room.getBagno());
                        switchWc.setChecked(room.getWc());
                        swithLavabo.setChecked(room.getLavabo());
                        switchVentola.setChecked(room.getVentola());
                    }

                    @Override
                    public void onError(String message) {

                    }
                }
        );
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bathroom);

        switchBagno = (Switch) findViewById(R.id.switch_bagno);
        switchWc = (Switch) findViewById(R.id.switch_wc);
        swithLavabo = (Switch) findViewById(R.id.switch_lavabo);
        switchVentola = (Switch) findViewById(R.id.switch_ventola);

        switchBagno.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW BAGNO", String.valueOf(isChecked));
                // TODO SEND TO PHP
            }
        });

        switchWc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW WC", String.valueOf(isChecked));
                // TODO SEND TO PHP
            }
        });

        swithLavabo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW LAVABO", String.valueOf(isChecked));
                // TODO SEND TO PHP
            }
        });

        switchVentola.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW ESTRATTORE", String.valueOf(isChecked));
                // TODO SEND TO PHP
            }
        });
    };
}
