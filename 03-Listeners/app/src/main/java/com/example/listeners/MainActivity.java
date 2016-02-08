package com.example.listeners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // declare class members
    private EditText toToastText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toToastText = (EditText) findViewById(R.id.etToToast);

        // initiate onClick callback for EditText only, but not yet for buttons
        toToastText.setOnClickListener(new TextOnClickListener());
    }

    private class TextOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) { // receive clicked view as parameter

        }
    }
}
