package com.rxjav.thanh.rxjavtest;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.widget.Toast;

import com.android.databinding.library.baseAdapters.BR;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

public class UserContent extends BaseObservable {
    @Bindable
    public String tailText;

    public String getTailText() {
        return tailText;
    }

    public void setTailText(String tailText) {
//        this.tailText. tailText;
    }

    @Bindable
    public List<Item4List> contentList;


    private Context ctx;
    Random d = new Random();

    public UserContent(Context myss) {
        contentList = new ArrayList<Item4List>();
        ctx = myss;
    }

    public void lickxongShow() {
        Toast.makeText(ctx, contentList.size() + "", Toast.LENGTH_SHORT).show();
        tailText = "da lick roi day";
        contentList.clear();
        contentList.add(new Item4List(ctx, "njss" + d.nextInt(100)));
        notifyPropertyChanged(com.rxjav.thanh.rxjavtest.BR.contentList);
    }

    public interface calldataUpdate {
        void dataupdate(Item4List item);
    }
}