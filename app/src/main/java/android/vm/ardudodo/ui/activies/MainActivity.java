package android.vm.ardudodo.ui.activies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.vm.ardudodo.R;

import android.widget.Button;

/**
 * Created by User on 26/01/2017.
 * Modify by Andrea on 31/01/2017
 */

public class MainActivity extends Activity {
    Button cucina, cameraLetto, cameretta, bagno, impostazioni;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ID ASSOCIATION
        cucina = (Button)findViewById(R.id.cucina);
        cameraLetto = (Button)findViewById(R.id.cameraLetto);
        cameretta = (Button)findViewById(R.id.cameretta);
        bagno = (Button)findViewById(R.id.bagno);
        impostazioni = (Button)findViewById(R.id.settings);

        //BUTTON ON CLICK LISTENER
        cucina.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,KitchenActivity.class));
            }
        });
        cameraLetto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BedroomActivity.class));
            }
        });
        cameretta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,KidRoomActivity.class));
            }
        });
        bagno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,BathroomActivity.class));
            }
        });
        impostazioni.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //TEST
                startActivity(new Intent(MainActivity.this,SettingsActivity.class));
            }
        });
    }
}
