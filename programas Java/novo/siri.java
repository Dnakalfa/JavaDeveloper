import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class siri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class siri extends Actor{
    boolean isOrientedToLeft = true;
    boolean isOrientedToRigth = true;
    boolean isOrientedToUp = true;
    boolean isOrientedToDown = true;
    int posX = 0;
    int posY = 0;
    public siri(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }
    public void act(){
        if(Greenfoot.isKeyDown("left")){
            turn(-2);
        }
                if(Greenfoot.isKeyDown("right")){
            move(2);
        }
        
    }
}
