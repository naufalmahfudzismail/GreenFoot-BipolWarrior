import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rock extends Obstacle
{
    /**
     * Act - do whatever the rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         //level();
        ilang();
        Level();
        
    }
    
    
  
    
     /*public void level()
    {
      bipolgame bipol = (bipolgame)getWorld();
      
      for (  int j = 20 ; j< j+20 ; j++)
      {
          for ( int i = 0; i<j ; i++)
          {
              if(bipol.getScore() >= j)
              {
                  move(5 + i);
              }
              
              else
              {
                  move(5);
              }
           
         }
    }
  }*/
}
