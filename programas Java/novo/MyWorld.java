import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World{
    
       public MyWorld(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("Mundo Subaquatico", 120, 12);
        addObject(new peixe(), 200, 100);
        addObject(new peixe(), 400, 100);
        addObject(new nemo(), 350, 180);
        addObject(new cavalo(), 120, 360);
        addObject(new ancora(), 500, 375);
        addObject(new dourada(), 300, 80);
        addObject(new siri(0, 0), 30, 100);
    }
    
}
