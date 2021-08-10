import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends Actor
{
    GreenfootSound myMusic = new GreenfootSound ("90's Game.mp3");
    boolean firstTurn = true; 

    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (firstTurn) {
            myMusic.playLoop();
            firstTurn = false;
        } 
        if (Greenfoot.mouseClicked(this) ){
            if (myMusic.isPlaying()){

                myMusic.pause();
                setImage("Play (1).png");
            } else 
            
            {
                myMusic.playLoop();
                setImage("Pausa (3).png");
            } 

        } 
    }
}
