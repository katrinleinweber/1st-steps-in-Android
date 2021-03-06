package com.example.listeners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;

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

        // initiate onClick callback for EditText only, but not yet for buttons
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

    private class ButtonOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btnClear) {
                toToastText.setText("");
                toToastText.setHint(getString(R.string.hnt_clrd));
            } else if (v.getId() == R.id.btnToast) {
                Toast.makeText(v.getContext(), toToastText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    private class ButtonHintOnLongClick implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View v) {
            String hint = null;
            Context context = v.getContext();
            if (v.getId() == R.id.btnClear) {
                hint = context.getString(R.string.hnt_btn_clr);
            } else if (v.getId() == R.id.btnToast) {
                hint = context.getString(R.string.hnt_tst_btn);
            }
            Toast.makeText(context, hint, Toast.LENGTH_LONG).show();
            return false; // onClick result shown after onLongClick result
        }
    }
}
