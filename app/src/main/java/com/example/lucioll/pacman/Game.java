package com.example.lucioll.pacman;

public class Game {
    //Variable de classe
    public Integer[][] grille;
    public int width;
    public int height;
    public PacMan paci;
    public Ghost[] listGhost;


    //Constructeur par défaut
    public Game(){
        this.grille = new Integer[][]{
                {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
                {5,6,2,6,6,6,6,6,6,6,6,4,6,6,6,6,6,6,5},
                {5,6,5,5,5,5,6,5,5,6,5,5,5,5,6,6,5,6,5},
                {5,6,6,5,5,6,6,5,5,6,5,5,5,5,6,5,5,6,5},
                {5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,3,6,5},
                {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
        };
        this.height = 6;
        this.width = 19;
        Ghost g1 = new Ghost(1,2,3);
        Ghost g2 = new Ghost(4,16,4);
        Ghost g3 = new Ghost(1,11,3);
        listGhost = new Ghost[]{g1,g2,g3};

    }

    //Constructeur avec argument
    public Game(Integer[][] uneGrille , int w, int h, PacMan p, Ghost[] lp){
        this.setGrille(uneGrille) ;
        this.setWidth(w) ;
        this.setHeight(h) ;
        this.setPaci(p) ;
        this.setListGhost(lp);
    }

    //Fonction qui crée la grille
    public void createGrille( int w, int h){
        Integer[][] grille = new Integer[w][h];
        for(int i=0;i<w;i++){
            for(i=0;i<h;i++){

            }
        }
    }

    //Accesseurs correspondant à la variable grille.
    public Integer[][] getGrille(){
        return this.grille ;
    }

    public void setGrille(Integer[][] uneGrille){
        this.grille = uneGrille ;
    }

    //Accesseurs correspondant à la variable width.
    public int getWidth(){
        return this.width ;
    }

    public void setWidth(int uneWidth){
        this.width = uneWidth ;
    }

    //Accesseurs correspondant à la variable height.
    public int getHeight(){
        return this.height ;
    }

    public void setHeight(int uneHeight){
        this.height = uneHeight ;
    }

    //Accesseurs correspondant à la variable paci.
    public PacMan getPaci(){
        return this.paci ;
    }

    public void setPaci(PacMan unPaci){
        this.paci = unPaci ;
    }
    //Accesseurs correspondant à la variable listGhost.
    public Ghost[] getListGhost(){
        return this.listGhost ;
    }

    public void setListGhost(Ghost[] lp){
        this.listGhost = lp ;
    }

}
