package mx.otniel.vulkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AskServiceActivity extends AppCompatActivity {

    private static final String TAG = AskServiceActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_service);
    }

    public void callToVulka(View view) {
        Intent intent = new Intent(this, CallActivity.class);
        startActivity(intent);
    }

    public void callMeVulka(View view) {
        Intent intent = new Intent(this, CallMeActivity.class);
        startActivity(intent);
    }
}
