package com.example.lucioll.pacman;
import java.util.Random;

public class Ghost{
    //Variable de classe
    private int x ;
    private int y ;
    private int direction ;
    private Game game;

    //Constructeur par défaut
    public Ghost(){} ;


    //Constructeur avec argument
    public Ghost(Game game, int x , int y, int direction){
        this.setG(game);
        this.setX(x) ;
        this.setY(y) ;
        this.setDirection(direction);
        this.game.grille[y][x]=3;
    }

    public int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public void moveAutomatic() {
        int direction = this.direction;
        int x = this.x;
        int y = this.y;
        int rand ;
        int i = 0;
        switch (this.direction) {
            case 1:
                while(i<10){
                    rand = randInt(1,3);
                    if (this.game.grille[y - 1][x] != 5 && rand == 1) { //haut
                        this.game.grille[y][x] = 6;
                        this.y = y - 1;
                        break;
                    } else if (this.game.grille[y][x - 1] != 5 && rand == 2) { //gauche
                        this.game.grille[y][x] = 6;
                        this.x = x - 1;
                        this.direction = 3;
                        break;
                    } else if (this.game.grille[y][x + 1] != 5 && rand == 3) { //droite
                        this.game.grille[y][x] = 6;
                        this.x = x + 1;
                        this.direction = 4;
                        break;
                    }
                    i++;
                }
                break;
            case 2:
                while(i<10){
                    rand = randInt(1,3);
                    if (this.game.grille[y + 1][x] != 5 && rand == 1) { //bas
                        this.game.grille[y][x] = 6;
                        this.y = y + 1;
                        break;
                    } else if (this.game.grille[y][x - 1] != 5 && rand == 2) { //gauche
                        this.game.grille[y][x] = 6;
                        this.x = x - 1;
                        this.direction = 3;
                        break;
                    }else if (this.game.grille[y][x + 1] != 5 && rand == 3) { //droite
                        this.game.grille[y][x] = 6;
                        this.x = x + 1;
                        this.direction = 4;
                        break;
                    }
                    i++;
                }
                break;
            case 3:
                while(i<10) {
                    rand = randInt(1, 3);
                    if (this.game.grille[y][x - 1] != 5 && rand == 1) { //gauche
                        this.game.grille[y][x] = 6;
                        this.x = x - 1;
                        break;
                    } else if (this.game.grille[y - 1][x] != 5 && rand == 2) { //haut
                        this.game.grille[y][x] = 6;
                        this.y = y - 1;
                        this.direction = 1;
                        break;
                    } else if (this.game.grille[y + 1][x] != 5 && rand == 3) { //bas
                        this.game.grille[y][x] = 6;
                        this.y = y + 1;
                        this.direction = 2;
                        break;
                    }
                    i++;
                }
                break;
            case 4:
                while(i<10) {
                    rand = randInt(1, 3);
                    if (this.game.grille[y][x + 1] != 5 && rand == 1) { //droite
                        this.game.grille[y][x] = 6;
                        this.x = x + 1;
                        break;
                    }else if (this.game.grille[y - 1][x] != 5 && rand == 2) { //haut
                        this.game.grille[y][x] = 6;
                        this.y = y - 1;
                        this.direction = 1;
                        break;
                    } else if (this.game.grille[y + 1][x] != 5 && rand == 3) { //bas
                        this.game.grille[y][x] = 6;
                        this.y = y + 1;
                        this.direction = 2;
                        break;
                    }
                    i++;
                }
                break;
        }
        this.game.grille[this.y][this.x]=3;
        eatPacMan();
    }

    //Fonction qui détecte si le fantôme mange PacMan
    public void eatPacMan(){
        int x = getX();
        int y = getY();
        //Si sur la case il y a PacMan
        if(this.game.getPaci().getX() == x && this.game.getPaci().getY() == y){
            System.out.println("Game Over !!!");
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
