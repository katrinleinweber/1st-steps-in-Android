package com.example.customadapter;

import android.view.LayoutInflater;
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

}
