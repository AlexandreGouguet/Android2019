package com.example.lucioll.pacman;

public class Ghost{
    //Variable de classe
    private int x ;
    private int y ;
    private int direction ;


    private Game game;

    //Constructeur par défaut
    public Ghost(){
        this(0,0,0) ;
    }

    //Constructeur avec argument
    public Ghost(int x , int y, int direction){
        this.setG(game);
        this.setX(x) ;
        this.setY(y) ;
        this.setDirection(direction);
    }

    /*public void moveAutomatic() {
        int direction = this.direction;
        int x = this.x;
        int y = this.y;
        switch (this.direction) {
            case 1:
                if (this.game.grille[y - 1][x] != 5) { //haut
                    this.x = x;
                    this.y = y - 1;
                    break;
                } else if (this.game.grille[y][x - 1] != 5) { //gauche
                    this.x = x - 1;
                    this.y = y;
                    break;
                } else if (this.game.grille[y][x + 1] != 5) { //droite
                    this.x = x + 1;
                    this.y = y;
                    break;
                }
            case 2:
                if (this.game.grille[y + 1][x] != 5) { //bas
                    this.x = x;
                    this.y = y + 1;
                    break;
                } else if (this.game.grille[y][x - 1] != 5) { //gauche
                    this.x = x - 1;
                    this.y = y;
                    break;
                } else if (this.game.grille[y][x + 1] != 5) { //droite
                    this.x = x + 1;
                    this.y = y;
                    break;
                }
            case 3:
                if (this.game.grille[y][x - 1] != 5) { //gauche
                    this.x = x - 1;
                    this.y = y;
                    break;
                }else if (this.game.grille[y - 1][x] != 5) { //haut
                    this.x = x;
                    this.y = y - 1;
                    break;
                } else if (this.game.grille[y + 1][x] != 5) { //bas
                    this.x = x;
                    this.y = y + 1;
                    break;
                }
            case 4:
                if (this.game.grille[y][x + 1] != 5) { //droite
                    this.x = x + 1;
                    this.y = y;
                    break;
                }else if (this.game.grille[y - 1][x] != 5) { //haut
                    this.x = x;
                    this.y = y - 1;
                    break;
                } else if (this.game.grille[y + 1][x] != 5) { //bas
                    this.x = x;
                    this.y = y + 1;
                    break;
                }
        }
    }*/

    //Fonction qui détecte si le fantôme mange PacMan
    public void eatPacMan(PacMan paco){
        int x = getX();
        int y = getY();
        //Si sur la case il y a PacMan
        if(this.game.getPaci().getX() == x && this.game.getPaci().getY() == y){
            
        }
    }

    public Game getG() {
        return game;
    }

    public void setG(Game g) {
        this.game = g;
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
