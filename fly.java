import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fly extends Actor
{
    /**
     * Act - do whatever the fly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(3);
         if (getX()==990)
         {
             setLocation(0, getY());
         }
        
    }    
}