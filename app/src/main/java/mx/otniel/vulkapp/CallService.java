package mx.otniel.vulkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CallService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_service);

        Intent intent = getIntent();

        final TextView textView = (TextView) findViewById(R.id.callingText);

        new android.os.Handler().postDelayed(
            new Runnable() {
                public void run() {
                    Log.i("tag", "This'll run 5 segs later");
                    int random = (int)(Math.random() * 2);
                    boolean busy = (random == 1);
                    Log.i("tag", "Busy..." + busy);
                    if(true) {
                        textView.setText("Linea ocupada, en breve te llamamos.");
                    } else {
                        textView.setText("Te han llamado... continuando.");
                    }
                }
            },
        5000);
    }
}
