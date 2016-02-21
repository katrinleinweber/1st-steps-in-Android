package com.example.dynamicviewlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        // unpack integer from intent
        int maxItems = getIntent().getExtras().getInt(Intent.EXTRA_UID);

        GridView gridView = (GridView) findViewById(R.id.gvItems);
        gridView.setAdapter(new ListGridAdapter(getLayoutInflater(),
                ListGridAdapter.AdapterMode.GRID, maxItems));
    }
}
