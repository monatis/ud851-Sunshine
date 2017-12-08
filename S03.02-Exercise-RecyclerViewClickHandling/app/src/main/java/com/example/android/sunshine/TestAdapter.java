package com.example.android.sunshine;

import android.support.v7.widget.RecyclerView;com.example.android.sunshine;

class TestAdapter extends RecyclerView.Adapter<TestHolder> {
    private ArrayList<TestItem> mItems;

    public void setData(List<TestItem items) {
        mItems = items;
        notifyDataSetHasChanged();
    }
}