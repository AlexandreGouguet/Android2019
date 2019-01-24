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
        game.grille[y][x]=1;
    }

    //Fonction qui déplace PacMan
    public void moving(int givenDirection){
        this.direction = givenDirection;
    }
    public void moveAutomatic() {
        int direction = this.direction;
        int x = this.x;
        int y = this.y;
        switch (this.direction) {
            case 1:
                if (this.game.grille[y - 1][x] != 5) { //haut
                    if (this.game.grille[y - 1][x] == 6) {
                        this.game.grille[y - 1][x] = 7;
                    }
                    this.game.grille[y][x] = 7;
                    this.x = x;
                    this.y = y - 1;
                }
                break;
            case 2:
                if (this.game.grille[y + 1][x] != 5) { //bas
                    if (this.game.grille[y + 1][x] == 6) {
                        this.game.grille[y + 1][x] = 7;
                    }
                    this.game.grille[y][x] = 7;
                    this.x = x;
                    this.y = y + 1;

                }
                break;
            case 3:
                if (this.game.grille[y][x - 1] != 5) { //gauche
                    if (this.game.grille[y][x - 1] == 6) {
                        this.game.grille[y][x - 1] = 7;
                    }
                    this.game.grille[y][x] = 7;
                    this.x = x - 1;
                    this.y = y;
                }
                break;
            case 4:
                if (this.game.grille[y][x + 1] != 5) { //droite
                    if (this.game.grille[y][x + 1] == 6) {
                        this.game.grille[y][x + 1] = 7;
                    }
                    this.game.grille[y][x] = 7;
                    this.x = x + 1;
                    this.y = y;
                }
                break;
        }
        game.grille[this.y][this.x]=1;
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
