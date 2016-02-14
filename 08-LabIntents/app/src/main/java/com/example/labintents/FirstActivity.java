package com.example.labintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_first);

        String bundleString = getIntent().getExtras().getString(Intent.EXTRA_TEXT);
        Toast.makeText(this, bundleString, Toast.LENGTH_SHORT).show();
    }

    public void forwardTo2nd (View v) {
        Intent forwardIntent = new Intent(FirstActivity.this, SecondActivity.class);
        forwardIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.toastFrom1st));
        startActivity(forwardIntent);
    }
}
