import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spawn extends Actor
{
     public int Level = 0;
    public int Rintangan = 0;
    public int Difficulty = 75;
    
    /**
     * Act - do whatever the Spawn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Level++;
        if(Level % Difficulty == 0)
        {
            bipolgame L1 = (bipolgame)getWorld();
            L1.call();
            if (Difficulty > 52)
            {
                Difficulty--;
            }
        }
        
    }
  
}
