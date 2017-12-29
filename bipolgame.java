import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BipolWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bipolgame extends World
{
 private  int score = 0;
  private int life  = 20;
  private GreenfootImage[] images = new GreenfootImage[10];
  private int currimage;
  public GreenfootSound music;
    public void UpdateScore()
   {
       score += 1;
       
    }
   public int getScore()
   {
       return score;
    }
    
    public int Life()
   {
       return life;
    }
    
    public void loseLife()
    {
        life--;
    }
    
    
    public bipolgame()
    {    
        super(1000, 560, 1);
        setPaintOrder(bipol.class, Obstacle.class);
        //setPaintOrder(GameOver.class, bipol.class);
        addObject(new player(), 850, 350);
        addObject(new back(), 120, 50);
        addObject(new fly(), 600, 50);
        addObject(new bipol(), -50, 400);
        addObject(new Spawn(), 0, 450);
        addObject(new Score(), 930, 50);
        call();
        music = new GreenfootSound("play2.mp3");
        music.playLoop();
        
      int i = 0;
        while (i<4)
        {
            if(i==0)
            {
                images[i] = new GreenfootImage("Background0.png");
                i++;
            } 
            else 
            {
                images[i] = new GreenfootImage("Background" + i + ".png");
                i++;
            }
        }
        currimage=0;
    }
    private void animatebg()
    {
        if(currimage == 3){
            currimage = 0;
        }
        else {
            currimage++;
        }
        setBackground(images[currimage]);
    }
     public void act() 
    {
        animatebg();
    }
    public void call()
    {
           int X = Greenfoot.getRandomNumber(10);
            if(X == 1)
            {
                
                addObject(new rock2(), 0, 450);                
            }
            if(X == 3)
            {
                addObject (new rock(), 0, 450);
                addObject(new rock2(), 30, 450);
            }
            if(X == 5)
            {
                 addObject(new rock2(),  0 , 450);
                 addObject(new barrel(), 30, 450);                
            }
            if(X == 7)
            {
                addObject(new rock(), 0, 450);
            }
            
            if(X == 9)
            {
                addObject(new barrel(), 0, 450);
            }
     }
    
}
