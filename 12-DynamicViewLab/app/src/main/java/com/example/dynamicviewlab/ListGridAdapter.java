package com.example.dynamicviewlab;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListGridAdapter extends BaseAdapter {

    // enumeration with 2 values
    public static enum AdapterMode {
        LIST,
        GRID
    }

    private LayoutInflater mInflater;
    private AdapterMode mCurrentMode;
    private int mMaxItems;

    // constructor receives LayoutInflater, AdapterMode & int
    public ListGridAdapter(LayoutInflater inflater, AdapterMode mode, int maxItems) {
        mInflater = inflater;
        mCurrentMode = mode;
        mMaxItems = maxItems;
    }

    @Override
    public int getCount() {
        return mMaxItems;
    }

    @Override
    public Object getItem(int position) {
        return new Integer(position + 1);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        boolean inListMode = mCurrentMode == AdapterMode.LIST;
        boolean isEvenPos = position % 2 == 0;
        if(convertView == null){
            convertView = mInflater.inflate(inListMode?
                    R.layout.list_item:R.layout.grid_item, parent, false);
        }

        ImageView icon = (ImageView) convertView.findViewById(R.id.ivIcon);

        int resourceID;
        if (inListMode) {
            resourceID = isEvenPos?android.R.drawable.ic_lock_lock:android.R.drawable.ic_dialog_alert;
        } else {
            resourceID = isEvenPos?android.R.drawable.ic_menu_call:android.R.drawable.ic_menu_add;
        } // test position for oddness & set different icons (syntax: testOnVariable?resource_if_yes:resource_if_no)

        icon.setImageResource(resourceID);

        TextView itemVal = (TextView) convertView.findViewById(R.id.tvValue);
        itemVal.setText(String.valueOf(position + 1));

        return convertView;
    }
}
