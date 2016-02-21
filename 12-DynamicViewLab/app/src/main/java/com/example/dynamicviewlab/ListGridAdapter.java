package com.example.dynamicviewlab;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;

public class ListGridAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private AdapterMode mCurrentMode;
    private int mMaxItems;

    // constructor receives LayoutInflater, AdapterMode & int
    public ListGridAdapter(LayoutInflater inflater, AdapterMode mode, int maxItems) {
        mInflater = inflater;
        mCurrentMode = mode;
        mMaxItems = maxItems;
    }
}
