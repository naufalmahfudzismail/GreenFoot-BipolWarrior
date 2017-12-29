import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    
  
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        bipolgame bipol = (bipolgame)getWorld();
        setImage(new GreenfootImage("Score : " + bipol.getScore() +"\n" + " Lives : " + bipol.Life(), 24, Color.RED,Color.WHITE));
    }    
}
