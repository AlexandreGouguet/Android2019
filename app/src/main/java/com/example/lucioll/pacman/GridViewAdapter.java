package com.example.lucioll.pacman;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {

    List<Integer> ImageSource;
    Context mContext;

    public GridViewAdapter(List<Integer> imageSource, Context mContext) {
        ImageSource = imageSource;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return ImageSource.size();
    }

    @Override
    public Object getItem(int position) {
        return ImageSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView image = new ImageView(mContext);
        image.setLayoutParams(new GridView.LayoutParams(GridView.LayoutParams.MATCH_PARENT, 32));
        image.setBackgroundColor(Color.WHITE);
        if(ImageSource.get(position)==5){
            image.setBackgroundColor(Color.BLUE);
        }
        else if(ImageSource.get(position)==6){
            int imageResource = mContext.getResources().getIdentifier("@drawable/buble",null, mContext.getPackageName());
            image.setImageResource(imageResource);
        }
        else if(ImageSource.get(position)==1){
            int imageResource = mContext.getResources().getIdentifier("@drawable/pacman",null, mContext.getPackageName());
            image.setImageResource(imageResource);
        }else{
            int imageResource = mContext.getResources().getIdentifier("@drawable/ghost",null, mContext.getPackageName());
            image.setImageResource(imageResource);
        }
        return image;
    }
}
