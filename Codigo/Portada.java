import greenfoot.*;

/**
 * Write a description of class Portada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portada extends World
{
  
    /**
     * Constructor for objects of class Portada.
     * 
     */
    public Portada()
    {
      super(900,600,1);
    if(Greenfoot.mouseClicked(this))
        {
           
            //Greenfoot.playSound("botonjugar.mp3");
            Greenfoot.setWorld(new Menu2());
     
  
            
           
        }
   

    }
}