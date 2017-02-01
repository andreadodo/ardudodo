package android.vm.ardudodo.ui.activies;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.vm.ardudodo.R;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * Created by andrea on 31/01/17.
 */

public class SettingsActivity extends Activity{
    EditText etCorDay, etCorNight, etDate, etTime;
    TextView etLux, tvI2c, etVentola;
    SeekBar sbCorDay, sbCorNight;
    Button btRstAll, btRstKitchen, btRstBdroomDx, btRstBdroomSx, btRstKidsroom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        etCorDay = (EditText)findViewById(R.id.et_cor_day);
        etCorNight = (EditText)findViewById(R.id.et_cor_night);
        etVentola = (EditText)findViewById(R.id.et_ventola);
        etDate = (EditText)findViewById(R.id.et_date);
        etTime = (EditText)findViewById(R.id.et_time);
        etLux = (TextView)findViewById(R.id.tv_lux);
        tvI2c = (TextView)findViewById(R.id.tv_i2c);
        sbCorDay = (SeekBar)findViewById(R.id.sb_cor_day);
        sbCorNight = (SeekBar)findViewById(R.id.sb_cor_night);
        btRstAll = (Button)findViewById(R.id.bt_rst_all);
        btRstKitchen = (Button)findViewById(R.id.bt_rst_kitchen);
        btRstBdroomDx = (Button)findViewById(R.id.bt_rst_bdroom_dx);
        btRstBdroomSx = (Button)findViewById(R.id.bt_rst_bdroom_sx);
        btRstKidsroom = (Button)findViewById(R.id.bt_rst_kidsroom);







    }
}

