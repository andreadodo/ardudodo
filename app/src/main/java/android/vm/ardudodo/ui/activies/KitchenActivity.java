package android.vm.ardudodo.ui.activies;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.vm.ardudodo.R;
import android.vm.ardudodo.controllers.KitchenController;
import android.vm.ardudodo.controllers.Rest;
import android.vm.ardudodo.models.Kitchen;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by Andrea on 26/01/2017.
 */

public class KitchenActivity extends Activity {
    Switch switchCucina, switchCorridoio;
    SeekBar seekBarCucina;
    TextView temp, umid;

    @Override
    protected void onStart() {
        super.onStart();
        new KitchenController(this).fetchDataFromUdoo(0, 0,
                new Rest.ResponseCallback<Kitchen>() {
                    @Override
                    public void onSuccess(Kitchen room) {
                        switchCucina.setChecked(room.getCucina());
                        switchCorridoio.setChecked(room.getCorridoio());
                        seekBarCucina.setProgress(room.getTapCucina());
                        temp.setText(room.getTemperatura());
                        umid.setText(room.getUmidita());
                    }

                    @Override
                    public void onError(String message) {

                    }
                }
        );
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        switchCucina = (Switch) findViewById(R.id.switch_cucina);
        switchCorridoio = (Switch) findViewById(R.id.switch_corridoio);
        seekBarCucina = (SeekBar) findViewById(R.id.seekBar_cucina);
        temp = (TextView) findViewById(R.id.tv_temperatura);
        umid = (TextView) findViewById(R.id.tv_umidita);

        switchCucina.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW CUCINA", String.valueOf(isChecked));
                //         rest.requestUdoo(0,0, callback )TODO SEND TO PHP
            }
        });

        switchCorridoio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW CORRIDOIO", String.valueOf(isChecked));
                // TODO SEND TO PHP
            }
        });

        seekBarCucina.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int val;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress = progress / 10; //TODO IMPROVE USER EXPERIENCE
                progress = progress * 10;
                val = progress;
                // seekBar.incrementProgressBy(1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBarCucina.setProgress(val);
                Log.d("SK CUCINA", String.valueOf(val)); //TODO SEND TO PHP
            }
        });


    }
}
