package com.example.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        // cast ListView to variable countingList
        ListView countingList = (ListView) findViewById(R.id.lvCounting);

        // set new adapter of class CountingListAdapter to cast ListView
        countingList.setAdapter(new CountingListAdapter(getLayoutInflater()));

        // also set ClickListener that constructs toast from adapter-provided data
        countingList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(view.getContext(), (String) parent.getAdapter().getItem(position),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
