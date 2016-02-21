package com.example.dynamicviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    private static final int MAX_LIST_ITEMS = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView) findViewById(R.id.lvItems);

        // set new instance of ListGridAdapter-class as adapter for listView
        listView.setAdapter(new ListGridAdapter(getLayoutInflater(),
                ListGridAdapter.AdapterMode.LIST, MAX_LIST_ITEMS));

    }
}
