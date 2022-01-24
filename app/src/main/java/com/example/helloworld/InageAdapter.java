package com.example.helloworld;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class InageAdapter extends BaseAdapter {

    private Context mcontext;

    public int [] imageArray={
         R.drawable.burger,R.drawable.burger1,R.drawable.firbase2,R.drawable.firebase1,
            R.drawable.hart,R.drawable.home,R.drawable.image3,R.drawable.image4
    };

    public InageAdapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int i) {
        return imageArray[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(mcontext);
        imageView.setImageResource(imageArray[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(300,350));


        return imageView;
    }
}
