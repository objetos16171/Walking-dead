import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class perdiste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class perdiste extends Actor
{
    
    /**
     * Act - do whatever the perdiste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
     public perdiste()
    {
     
    if(Greenfoot.mouseClicked(this))
        {
           
            //Greenfoot.playSound("botonjugar.mp3");
            Greenfoot.setWorld(new Menu2());
     
  
            
           
        }
}
}

