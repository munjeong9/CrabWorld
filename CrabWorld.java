import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
<<<<<<< HEAD
    Label scoreBoard = new Label("Score : 0");
=======
    Label scoreBoard = new Label("Worms : 0");
>>>>>>> parent of c7495d2... Delete CrabWorld.java
    int nowcount = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Crab(), 50, 50);
        addObject(new Worm(), 100, 100);
        addObject(new Lobster(), 300, 300);
        addObject(new turtle(), 100, 200);
        addObject(new Worm(), 99, 57);
        addObject(new Worm(), 299, 78);
        addObject(new Worm(), 499, 300);
        addObject(new Worm(), 388, 390);
        addObject(new Worm(), 100, 390);
        addObject(new Worm(), 150, 300);
        addObject(new Worm(), 278, 200);
        addObject(new Worm(), 500, 250);
        addObject(new Worm(), 570, 170);
        addObject(new Worm(), 420, 350);
        addObject(new Worm(), 530, 80);
        addObject(new Worm(), 400, 160);
            
      
        addObject(scoreBoard, 600, 20);
       
    }
    
    public void act()
    {
<<<<<<< HEAD
        scoreBoard.setText("Score : "+ Crab.score);
=======
        scoreBoard.setText("Worms : "+ Crab.score);
>>>>>>> parent of c7495d2... Delete CrabWorld.java
        
        if ( Crab.score % 100 == 0  &&! (nowcount == Crab.score))
        {
            addObject ( new Lobster(),200, 300);
            nowcount =  Crab.score;
        }
    }
}
