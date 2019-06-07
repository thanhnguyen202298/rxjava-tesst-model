package com.rxjav.thanh.rxjavtest;

import android.content.Context;
import android.widget.Toast;

public class Item4List {
    public String text;
    private Context ctx;
    public Item4List (Context context,String content){
        ctx =context;
        text = content;
    }
    public void clickWarning(){
        Toast.makeText(ctx, "this is from click "+ text, Toast.LENGTH_SHORT).show();
    }


}
