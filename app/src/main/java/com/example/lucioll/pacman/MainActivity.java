package com.example.lucioll.pacman;

import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Timer mTimer = new Timer();
    public int i = 0;
    enum direction {north,south,west,east};
    public Game myApp = new Game();
    public PacMan paci;
    private static Context context;
    public List<Integer> ImageSource = new ArrayList<>();

    GridViewAdapter adapter = new GridViewAdapter(myApp.grille,this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity.context = getApplicationContext();

        //affichage initial
        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
        paci = new PacMan(4,1,4, myApp);

        //mise a jour initial
        mTimer.scheduleAtFixedRate(update, 2000, 2000);
    }

    public void inputTriggered(View v){
        if(v.getId()==R.id.N){
            //actualiser les positions du pac-man pour le bouton Nord
            paci.moving(1);
        }

        if(v.getId()==R.id.O){
            //actualiser les positions du pac-man pour le bouton Ouest
            paci.moving(3);
        }

        if(v.getId()==R.id.E){
            //actualiser les positions du pac-man pour le bouton Est
            paci.moving(4);
        }

        if(v.getId()==R.id.S){
            //actualiser les positions du pac-man pour le bouton Sud
            paci.moving(2);
        }
        GridView gridView = findViewById(R.id.gridView);
        adapter.notifyDataSetChanged();
    }

    private TimerTask update = new TimerTask() {
        @Override
        public void run() {
            for (int i = 0; i < myApp.grille.length; i++){
                //GridView gridView = (GridView)findViewById(R.id.gridView);
                //gridView.invalidateViews();
                System.out.println(Arrays.toString(myApp.grille[i]));
            }
            /*GridView gridView = (GridView)findViewById(R.id.gridView);
            gridView.setAdapter(adapter);*/
        }
    };
}
