package com.example.implicitreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class receivingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving);
    }

    public void callBack(View view) {
        Intent callBack = new Intent();
        callBack.putExtra(Intent.EXTRA_TEXT, getString(R.string.reply));
        startActivity(callBack);
    }
}
