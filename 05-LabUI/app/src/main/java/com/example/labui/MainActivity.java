package com.example.labui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLeft;
    private Button btnRight;
    private ButtonOnClickListener switchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_part_2);

        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);

        switchButton = new ButtonOnClickListener();

        // bind both to enable repetition
        btnLeft.setOnClickListener(switchButton);
        btnRight.setOnClickListener(switchButton);
    }

    private class ButtonOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btnLeft) {
                btnLeft.setText(getString(R.string.empty));
                btnRight.setText(R.string.clickMe);
            } else if (v.getId() == R.id.btnRight) {
                btnLeft.setText(R.string.clickMe);
                btnRight.setText(R.string.empty);
            }
            // more elegant method for switching repeatedly?
        }
    }
}

