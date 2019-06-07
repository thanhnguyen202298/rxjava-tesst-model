package com.rxjav.thanh.rxjavtest;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

public class MyBindUtile {
    @BindingAdapter("android:data")
    public static void setListDataRV(RecyclerView v, Object newitems) {
        if (v.getAdapter() instanceof MyBindingAdapter) {
            ((MyBindingAdapter)v.getAdapter()).setData(newitems);
        }
    }
}