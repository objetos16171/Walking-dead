import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Record here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditos extends Actor
{
    /**
     * Act - do whatever the Record wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      if(Greenfoot.mouseClicked(this))
        {
           
            //Greenfoot.playSound("botonjugar.mp3");
            Greenfoot.setWorld(new Portada());
     
  
            
           
        }
    }    
}
