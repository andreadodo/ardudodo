package android.vm.ardudodo.ui.activies;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.vm.ardudodo.R;
import android.vm.ardudodo.controllers.Rest;
import android.vm.ardudodo.models.Bedroom;
import android.vm.ardudodo.models.Kitchen;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

/**
 * Created by User on 26/01/2017.
 */

public class BedroomActivity extends Activity {
    Switch switchLetto, switchComDx, switchComSx;
    SeekBar seekBarDx, seekBarSx;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigbedroom);

        switchLetto = (Switch) findViewById(R.id.switch_letto);
        switchComDx = (Switch) findViewById(R.id.switch_comodino_anna);
        switchComSx = (Switch) findViewById(R.id.switch_comodino_sergio);
        seekBarDx = (SeekBar) findViewById(R.id.seekBar_destra);
        seekBarSx = (SeekBar) findViewById(R.id.seekBar_sinistra);

        switchLetto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW LETTO", String.valueOf(isChecked));
                // TODO SEND TO PHP
            }
        });

        switchComDx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW COM DX", String.valueOf(isChecked));
                // TODO SEND TO PHP
            }
        });

        switchComSx.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW COM SX", String.valueOf(isChecked));
                // TODO SEND TO PHP
            }
        });

        seekBarDx.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int val;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress = progress / 10; //TODO IMPROVE USER EXPERIENCE
                progress = progress * 10;
                val=progress;
                // seekBar.incrementProgressBy(1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBarDx.setProgress(val);
                Log.d("SK CUCINA", String.valueOf(val)); //TODO SEND TO PHP
            }
        });
        seekBarSx.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int val;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress = progress / 10; //TODO IMPROVE USER EXPERIENCE
                progress = progress * 10;
                val=progress;
                // seekBar.incrementProgressBy(1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBarSx.setProgress(val);
                Log.d("SK CUCINA", String.valueOf(val)); //TODO SEND TO PHP
            }
        });

        new Rest.ResponseCallback<Bedroom>() {
            @Override
            public void onSuccess(Bedroom room) {

            }

            @Override
            public void onError(String message) {

            }
        };
    }
}
