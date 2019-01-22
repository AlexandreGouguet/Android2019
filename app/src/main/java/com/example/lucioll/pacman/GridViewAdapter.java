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

    Integer[][] grille;
    Context mContext;

    public GridViewAdapter(Integer[][] grille, Context mContext) {
        this.grille = grille;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return this.grille[0].length*this.grille.length;
    }

    @Override
    public Object getItem(int position) {
        return this.grille[position/19][position%19];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView image = new ImageView(mContext);
        image.setLayoutParams(new GridView.LayoutParams(GridView.LayoutParams.MATCH_PARENT, 32));
        image.setBackgroundColor(Color.BLACK);
        int content = getContentAt(position);
        if(content==5){
            image.setBackgroundColor(Color.BLUE);
        }
        else if(content==6){
            int imageResource = mContext.getResources().getIdentifier("@drawable/buble",null, mContext.getPackageName());
            image.setImageResource(imageResource);
        }
        else if(content==1){
            int imageResource = mContext.getResources().getIdentifier("@drawable/pacman",null, mContext.getPackageName());
            image.setImageResource(imageResource);
        }else if(content==7){
            image.setImageResource(android.R.color.transparent);
        }else{
            int imageResource = mContext.getResources().getIdentifier("@drawable/ghost",null, mContext.getPackageName());
            image.setImageResource(imageResource);
        }
        return image;
    }

    private int getContentAt(int position){
        return this.grille[position/19][position%19];
    }
}
