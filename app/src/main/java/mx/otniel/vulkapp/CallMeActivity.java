package mx.otniel.vulkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class CallMeActivity extends AppCompatActivity {

    private static final String TAG = CallMeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_service);

        Intent intent = getIntent();

        final TextView textView = (TextView) findViewById(R.id.callingText);
        textView.setText("En breve te llamaremos.");
    }
}

