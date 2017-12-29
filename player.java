import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    private GreenfootImage[] images = new GreenfootImage[10];
    private int currimage;
    public int Vspeed; 
    public int LevelGround = 350;
    
 
    
    public void act() 
    {
        animateplayer();
       jump();
        kena();
        gameOver();
    }
    
    /*public void lompatanimate()
    {
        int i = 0;
        while( i <= 9)
        {
            images[i] = new GreenfootImage("Jump_00"+i+".png");
            i++;
        }
    }*/
    public player()
    {
        int i = 0;
        while (i<10)
        {
            if(i==0)
            {
                images[i] = new GreenfootImage("Walk0.png");
                i++;
            } 
            else 
            {
                images[i] = new GreenfootImage("Walk" + i + ".png");
                i++;
            }
        }
        currimage=0;
    }
    
     private void animateplayer()
    {
        if(currimage == 9){
            currimage = 0;
        }
        else {
            currimage++;
        }
        setImage(images[currimage]);
    }
    
    
    
    public void jump()
    { 
        //Vspeed = -jumpStr;
        //fall();
        
        boolean onGround = (getY() == LevelGround);
        if(!onGround)
        {
            Vspeed++;
            setLocation(getX(), getY() + Vspeed);
            if(getY() == LevelGround)
            {
                setLocation(getX(), LevelGround);
            }
        }
        else
        {
             if(Greenfoot.isKeyDown("space"))
             {
            
                 Vspeed = -25;
                 setLocation(getX(), getY() + Vspeed);
                 Greenfoot.playSound("jump.mp3");
             }
             
        }
        
    }
  
    private void kena()
    {
   
        
        bipolgame bipol = (bipolgame)getWorld();
        if(isTouching(Obstacle.class))
        {
             bipol.loseLife();
             //getWorld().showText(""+bipol.Life(), 100 ,150);
             removeTouching(Obstacle.class);
             
        }
        else
        {
            bipol.UpdateScore();
            //getWorld().showText(" "+bipol.getScore(), 150 ,100);
        }
    }
    
    public void gameOver()
    {
        bipolgame bipol = (bipolgame)getWorld();
        if( bipol.Life() == 0)
        {
            Greenfoot.playSound("game-over.mp3");
            
            getWorld().showText(" Game Over" + "\n" + " Score :" + bipol.getScore(), 500, 280);
            bipolgame world = (bipolgame) getWorld();
            world.music.stop();
            Greenfoot.stop();
            //getWorld().addObject(new GameOver(), 500, 280);
        }
    }
    
   
   
}

