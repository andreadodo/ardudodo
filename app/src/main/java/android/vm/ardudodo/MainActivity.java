package android.vm.ardudodo;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

/**
 * Created by User on 26/01/2017.
 */

public class MainActivity extends Activity {
    Button cucina;
    Button cameraLetto;
    Button cameretta;
    Button bagno;
    Activity activity= this;
    SeekBar seekbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cucina= (Button) findViewById(R.id.cucina);
        cucina.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(activity,KitchenActivity.class);
                startActivity(intent);
            }
        });
        cameraLetto= (Button) findViewById(R.id.cameraLetto);
        cameraLetto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(activity,BigBedroomActivity.class);
                startActivity(intent2);
            }
        });
        cameretta= (Button) findViewById(R.id.cameretta);
        cameretta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(activity,LittleBedroomActivity.class);
                startActivity(intent3);
            }
        });
        bagno= (Button) findViewById(R.id.bagno);
        bagno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent(activity,BathroomActivity.class);
                startActivity(intent4);
            }
        });
    }
}
