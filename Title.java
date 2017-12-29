import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public GreenfootSound music;
    public Title()
    {    
        super(1100, 560, 1);
        addObject(new start(), 930, 250);
        addObject(new cr(), 930, 325);
        addObject(new exit(), 930, 400);
        music = new GreenfootSound("menu.mp3");
        music.playLoop();
    }
}
