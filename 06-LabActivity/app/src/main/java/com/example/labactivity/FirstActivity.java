package com.example.labactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG = "FirstActivity"; // FirstActivity.class.toString() automates & expands class string

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.d(TAG, "I'm in onCreate() right now!");
    }

    @Override
    protected void onStart(){
        super.onStart();

        Log.d(TAG, "I'm in onStart() right now!");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "I'm in onResume() right now!");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "I'm in onPause() right now!");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "I'm in onStop() right now!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "I'm in onDestroy() right now!");
    }
}
