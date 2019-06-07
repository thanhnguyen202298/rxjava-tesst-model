package com.rxjav.thanh.rxjavtest;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import com.rxjav.thanh.rxjavtest.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;
    UserContent m;
    listAda k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        k = new listAda();
        m = new UserContent(this);
        m.contentList.add(new Item4List(this, "thanh"));
        m.contentList.add(new Item4List(this, "liễu"));
        m.contentList.add(new Item4List(this, "binh"));

        m.tailText = "Hi all  iam a textbinding";
        mainBinding.setMaincontent(m);

        mainBinding.listcontent.setAdapter(k);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        mainBinding.listcontent.setHasFixedSize(true);
        mainBinding.listcontent.setLayoutManager(lm);

    }


}