import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Regresar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Regresar extends Actor
{
   
    /**
     * Act - do whatever the salir wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Regresar();
    }
        private void Regresar()
        {
            if (Greenfoot.mouseClicked(this))
            {
                Greenfoot.playSound("botonjugar.mp3");
                Greenfoot.setWorld(new Menu2());
               // Greenfoot.stop();
            }
        
        
   // Add your action code here.
    }    
}
