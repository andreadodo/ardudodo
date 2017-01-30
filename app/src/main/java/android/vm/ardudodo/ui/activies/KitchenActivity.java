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
        seekBarCucina.incrementProgressBy(10);


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
                progress = progress / 10;
                progress = progress * 10;
                val=progress;
               // seekBar.incrementProgressBy(1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                seekBarCucina.setProgress(val);
                Log.d("SK CUCINA", String.valueOf(val));
            }
        });
    }
}
