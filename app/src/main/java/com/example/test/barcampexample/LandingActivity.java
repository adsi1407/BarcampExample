package com.example.test.barcampexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by DAVIDPORTATILW7 on 09/10/2015.
 */
public class LandingActivity extends ActionBarActivity {

    Button btnMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_activity);

        btnMessage = (Button)findViewById(R.id.btnMessage);
        final Intent intent = new Intent(this, LandingActivity.class);

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = getString(R.string.message_text);
                Toast.makeText(LandingActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
