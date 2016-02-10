package com.example.gravity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // [ ] create buttons or tabs to switch between views

    private Button showMargin;
    private Button showPadding;
    private Button showGravity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // setContentView(R.layout.activity_main_margin);btnMrgn
        // setContentView(R.layout.activity_main_padding);btnPddng
        // setContentView(R.layout.activity_main_gravity);btnGrvt
    }
}
