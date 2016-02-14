package com.example.labintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    public void backTo1st(View v) {
        Intent backTo1st = new Intent(SecondActivity.this, FirstActivity.class);
        backTo1st.putExtra(Intent.EXTRA_TEXT, getString(R.string.toastFrom2nd));
        startActivity(backTo1st);
    }
}
