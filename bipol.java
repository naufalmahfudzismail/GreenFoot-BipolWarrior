import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bipol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bipol extends Actor
{
    /**
     * Act - do whatever the bipol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] images = new GreenfootImage[10];
    private int currimage;
    public void act() 
    {
        // Add your action code here.
        animatebipol();
    }    
    public bipol()
    {
        int i = 0;
        while (i<8)
        {
            if(i==0)
            {
                images[i] = new GreenfootImage("bipol0.png");
                i++;
            } 
            else 
            {
                images[i] = new GreenfootImage("bipol" + i + ".png");
                i++;
            }
        }
        currimage=0;
    }
    
     private void animatebipol()
    {
        if(currimage == 7){
            currimage = 0;
        }
        else {
            currimage++;
        }
        setImage(images[currimage]);
    }
}
