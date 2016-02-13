package com.example.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String bundleString = getIntent().getExtras().getString(Intent.EXTRA_TEXT);
        Toast.makeText(this, bundleString, Toast.LENGTH_SHORT).show();
    }

    public void onButtonClick(View view) {
        Intent implicitIntent = new Intent();
        implicitIntent.setAction(Intent.ACTION_DIAL);
        startActivity(implicitIntent);
    }
}
