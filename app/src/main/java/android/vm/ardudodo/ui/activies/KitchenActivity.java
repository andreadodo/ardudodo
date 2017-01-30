package android.vm.ardudodo.ui.activies;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.vm.ardudodo.R;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

/**
 * Created by User on 26/01/2017.
 */

public class KitchenActivity extends Activity {
    Switch switchCucina;
    SeekBar seekBarCucina;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        switchCucina = (Switch) findViewById(R.id.switch_cucina);
        seekBarCucina = (SeekBar) findViewById(R.id.seekBar_cucina);

        switchCucina.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW CUCINA", String.valueOf(isChecked));
                //TBD SEND TO PHP
            }
        });

        seekBarCucina.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int val;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                val=progress;
               // slider.incrementProgressBy(5);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("SK CUCINA", String.valueOf(val));
            }
        });
    }
}
