package com.example.labintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private EditText txtTo1st;
    public static final String EXTRA_MSG_KEY = "EXTRA_MSG_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String bundleString = getIntent().getExtras().getString(Intent.EXTRA_TEXT);
        Toast.makeText(this, bundleString, Toast.LENGTH_SHORT).show();

        txtTo1st = (EditText) findViewById(R.id.txt2nd);
    }

    public void backTo1st(View v) {
        Intent backTo1st = new Intent(SecondActivity.this, FirstActivity.class);
        backTo1st.putExtra(EXTRA_MSG_KEY, txtTo1st.getText().toString());
        startActivity(backTo1st);
    }
}
