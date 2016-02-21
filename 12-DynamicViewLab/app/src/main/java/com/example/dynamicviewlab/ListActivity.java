package com.example.dynamicviewlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        // create new intent to GridActivity-class within ClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent gridIntent = new Intent(view.getContext(), GridActivity.class);

    }
}
