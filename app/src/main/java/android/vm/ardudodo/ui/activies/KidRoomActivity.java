package android.vm.ardudodo.ui.activies;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.vm.ardudodo.R;
import android.vm.ardudodo.controllers.Rest;
import android.vm.ardudodo.models.KidRoom;
import android.vm.ardudodo.models.Kitchen;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

/**
 * Created by User on 27/01/2017.
 */

public class KidRoomActivity extends Activity {
    Switch switchCameretta;
    SeekBar seekBarCameretta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidroom);

        switchCameretta = (Switch) findViewById(R.id.switch_cameretta);
        seekBarCameretta = (SeekBar) findViewById(R.id.seekBar_cameretta);

        switchCameretta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton s, boolean isChecked) {
                Log.d("SW CAMERETTA", String.valueOf(isChecked));
                // TODO SEND TO PHP
            }
        });

        seekBarCameretta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
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
                seekBarCameretta.setProgress(val);
                Log.d("SK CAMERETTA", String.valueOf(val)); //TODO SEND TO PHP
            }
        });

        new Rest.ResponseCallback<KidRoom>() {
            @Override
            public void onSuccess(KidRoom room) {
                switchCameretta.setChecked(room.getCameretta());
                seekBarCameretta.setProgress(room.getTapCameretta());
            }

            @Override
            public void onError(String message) {

            }
        };
    }
}
