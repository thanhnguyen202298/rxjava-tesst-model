package com.rxjav.thanh.rxjavtest;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.rxjav.thanh.rxjavtest.databinding.ItemLayoutBinding;
import java.util.ArrayList;
import java.util.List;

public class listAda extends RecyclerView.Adapter<listAda.MystringVH> implements MyBindingAdapter<List<Item4List>> {

    private List<Item4List> myitems;

    public listAda() {
        myitems = new ArrayList<>();
    }
//
//    public void updateContent(List<Item4List> someitem) {
//        myitems.addAll(someitem);
//        notifyDataSetChanged();
//    }
//
//    public void add(Item4List item){
//        myitems.add(item);
//        notifyDataSetChanged();
//    }

    public MystringVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(viewGroup.getContext());
        ItemLayoutBinding dataBinding = DataBindingUtil.inflate(li, R.layout.item_layout, viewGroup, false);
        return new MystringVH(dataBinding);
    }

    public void onBindViewHolder(@NonNull MystringVH mystringVH, final int i) {
        mystringVH.bind(myitems.get(i));
    }

    public int getItemCount() {
        return myitems.size();
    }

    public void setData(List<Item4List> data) {
        myitems.addAll(data);
        notifyDataSetChanged();
    }

    public class MystringVH extends RecyclerView.ViewHolder {
        private ViewDataBinding vhdataBinding;

        public MystringVH(ViewDataBinding dataBinding) {
            super(dataBinding.getRoot());
            vhdataBinding = dataBinding;
        }

        public void bind(Object object) {
            vhdataBinding.setVariable(BR.item, object);
//            vhdataBinding.executePendingBindings();
        }
    }
}
