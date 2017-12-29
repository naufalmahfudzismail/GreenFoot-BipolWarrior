import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    public int x;
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    /*public void Touch()
    {
        if (isTouching(player.class))
        {
            getWorld().removeObject(this);
        }
    }*/
    
    public void ilang()
    {
        x = getX();
         if (x == 1000)
         {
            getWorld().removeObject(this);
         }      
    }
    
      public void Level()
    {
        bipolgame bipol = (bipolgame) getWorld();
       
        if (bipol.getScore() >= 300 && bipol.getScore() < 700 )
        {
         move (4);        
        }
        else if (bipol.getScore() >= 700 && bipol.getScore() < 1000)
        { 
          move (5);      
        }
           
        else if(bipol.getScore() >= 1000 && bipol.getScore() < 1400)
        {
           move(6);
        }
        
         else if(bipol.getScore() >= 1400 && bipol.getScore() < 3000)
        {
              move(7);
        }
        
        else if(bipol.getScore() >= 3000)
        {
           move(8);
        }
        
        else
        {
           move(3);
        }
        
    }
}
