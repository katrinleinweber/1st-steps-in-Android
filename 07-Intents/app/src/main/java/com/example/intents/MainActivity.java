package com.example.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent secondIntent = new Intent(this, SecondActivity.class);
        secondIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.trnsfrTXT));
        startActivity(secondIntent);
    }
}
