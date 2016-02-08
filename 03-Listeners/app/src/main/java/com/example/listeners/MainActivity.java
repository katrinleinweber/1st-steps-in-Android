package com.example.listeners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declare class members
    private EditText toToastText;
    private Button clearButton;
    private Button toastButton;
    private ButtonOnClickListener buttonListen;
    private ButtonHintOnLongClick buttonHintListen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind EditText & Buttons to implementations from .xml
        toToastText = (EditText) findViewById(R.id.etToToast);
        clearButton = (Button) findViewById(R.id.btnClear);
        toastButton = (Button) findViewById(R.id.btnToast);

        // initiate onClick callbacks for EditText only, but not yet for buttons
        toToastText.setOnClickListener(new TextOnClickListener());
    }

    private class TextOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) { // receive clicked view as parameter

            // initiated listeners once EditText is clicked
            buttonListen = new ButtonOnClickListener();
            buttonHintListen = new ButtonHintOnLongClick();

            // same callback for both buttons
            clearButton.setOnClickListener(buttonListen);
            toastButton.setOnClickListener(buttonListen);
            clearButton.setOnLongClickListener(buttonHintListen);
            toastButton.setOnLongClickListener(buttonHintListen);
        }
    }
    }
}
