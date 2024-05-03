import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cavalo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cavalo extends Actor
{
    /**
     * Act - do whatever the cavalo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move((int)(Math.random() * 4 - 2));
    }
}
