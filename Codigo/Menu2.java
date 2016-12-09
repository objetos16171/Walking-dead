import greenfoot.*;

/**
 * Write a description of class Menu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu2 extends World
{

    /**
     * Constructor for objects of class Menu2.
     * 
     */
    public Menu2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
     
        super(900, 600, 1); 
       GreenfootSound sound =new GreenfootSound("//ZombieMenu.mp3");
        sound.play();
        addObject(new botonplay(sound), 446, 247);
        addObject(new ayuda(), 444, 320);
        addObject(new Creditos(), 182, 300);
        addObject(new salir(), 446, 472);
       
        
        
   
    }
    public void detenM(GreenfootSound m)
    {
        m.stop();
    
}
}
