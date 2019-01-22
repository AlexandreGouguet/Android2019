package com.example.lucioll.pacman;

public class Ghost{
    //Variable de classe
    private int x ;
    private int y ;
    private int direction ;

    //Constructeur par défaut
    public Ghost(){
        this(0,0,0) ;
    }

    //Constructeur avec argument
    public Ghost(int x , int y, int direction){
        this.setX(x) ;
        this.setY(y) ;
        this.setDirection(direction);
    }
/*
    //Fonction qui déplace le fantôme
    public void moving(Grid grille){
        int x = getX();
        int y = getY();
        int direction = getDirection();
        // ...
    }
*/
    //Fonction qui détecte si le fantôme mange PacMan
    public void eatPacMan(PacMan paco){
        int x = getX();
        int y = getY();
        //Si sur la case il y a une boule
        // ...
    }

    //Accesseurs correspondant à la variable x.
    public int getX(){
        return this.x ;
    }

    public void setX(int x){
        this.x = x ;
    }

    //Accesseurs correspondant à la variable y.
    public int getY(){
        return this.y ;
    }

    public void setY(int y){
        this.y = y ;
    }

    //Accesseurs correspondant à la variable direction.
    public int getDirection(){
        return this.direction ;
    }

    public void setDirection(int Direction){
        this.direction = Direction ;
    }

}
