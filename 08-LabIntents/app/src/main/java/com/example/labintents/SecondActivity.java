package com.example.labintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void backTo1st(View v) {
        Intent backTo1st = new Intent(SecondActivity.this, FirstActivity.class);
        startActivity(backTo1st);
    }
}
