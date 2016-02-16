package com.example.customadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CountingListAdapter extends BaseAdapter {

    private static final int MAX_COUNT = 36;
    private LayoutInflater mInflater;

    // constructor that receives LayoutInflater
    public CountingListAdapter(LayoutInflater inflater) {
        mInflater = inflater;
    }

    @Override // setting a constant
    public int getCount() {
        return MAX_COUNT;
    }

    @Override // callback returns different strings for toast, depending on item position
    public Object getItem(int position) {
        if (position > (MAX_COUNT/2)) {
            return position + " down the list";
        } else {
            return "This is item: " + position;
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override // method
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) { // inflate .xml if view empty
            convertView = mInflater.inflate(R.layout.list_item, parent, false);
        }

        // search (inflated) convertView for IDs
        ImageView image = (ImageView) convertView.findViewById(R.id.ivIcon);
    }
}
