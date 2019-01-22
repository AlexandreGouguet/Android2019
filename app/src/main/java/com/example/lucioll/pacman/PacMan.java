package com.example.lucioll.pacman;

public class PacMan{
    //Variable de classe
    private int x ;
    private int y ;
    private int direction ;
    public Game game;

    //Constructeur avec argument
    public PacMan(int x , int y, int direction, Game game){
        this.setX(x);
        this.setY(y);
        this.setDirection(direction);
        this.game = game;
    }

    //Fonction qui déplace PacMan
    public void moving(int givenDirection){
        int x = this.getX();
        int y = this.getY();

        switch (givenDirection){
            case 1:
                this.setY(y-1);
                break;
            case 2:
                this.setX(x+1);
                break;
            case 3:
                this.setX(x-1);
                break;
            case 4:
                this.setY(y+1);
                break;
        }

        this.direction = givenDirection;
        this.game.grille[y][x]=7;
        this.game.grille[this.getY()][this.getX()]=1;
    }

    //Fonction qui détecte si PacMan mange
    public void eat(Integer[][] grille){
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
