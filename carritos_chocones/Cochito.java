import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cochito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cochito extends Actor
{
    GifImage myGif = new GifImage("Cochito.gif");
    /**
     * Act - do whatever the Cochito wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage (myGif.getCurrentImage());
    }
}
