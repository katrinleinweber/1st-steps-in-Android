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

        // declare local variables (can't be done on the fly within in the statements
        Intent backTo1st = getIntent();
        Bundle toastFrom2nd = null;

        // check for extras of intent
        if (backTo1st != null) {
            toastFrom2nd = backTo1st.getExtras();
        }

        // check for message within extras
        if (toastFrom2nd != null && toastFrom2nd.containsKey(SecondActivity.EXTRA_MSG_KEY)) {
            Toast.makeText(this, toastFrom2nd.getString(SecondActivity.EXTRA_MSG_KEY), Toast.LENGTH_LONG).show();
        }
    }

    public void forwardTo2nd (View v) {
        Intent forwardIntent = new Intent(FirstActivity.this, SecondActivity.class);
        forwardIntent.putExtra(Intent.EXTRA_TEXT, getString(R.string.toastFrom1st));
        startActivity(forwardIntent);
    }
}
