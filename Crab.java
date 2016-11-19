import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    public static int score = 0;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(3);
       lookForWorm();
       setScore();
       
       if (Greenfoot.getRandomNumber (100) < 10)
       {
           turn(Greenfoot.getRandomNumber(90) - 45);
        }
       
       if(isAtEdge())
       {
           turn(17);
        }
       
       if(Greenfoot.isKeyDown("right"))
       turn(4);
       
       if(Greenfoot.isKeyDown("left"))
       turn(-4);
    }
    
    public void lookForWorm()
    {
        if ( isTouching (Worm.class) )
        {
            removeTouching (Worm.class);
            score = score + 10;
        }
    }    
    
    public void setScore()
    {
        if ( score >  300)
        {
           World CrabWorld = getWorld();
            Victory victory = new Victory();
            CrabWorld.addObject (victory, CrabWorld.getWidth()/2, CrabWorld.getHeight()/2);
        }
    }
}
