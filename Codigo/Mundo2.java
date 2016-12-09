import greenfoot.*;

/**
 *En este escenario se desarrolla el nivel 2 donde el jugador tiene que matar a los zombies
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo2 extends World
{

    /**
     * Nivel 2
     * 
     */
    private Jugador jugador;
    private Mundo3 mundo3;
    public Mundo2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        jugador = new Jugador();
        mundo3 = new Mundo3();
        insertarJugador();
        insertarMounstro();
        insertarMeta();
        
        Greenfoot.playSound("Zombie2.mp3");
    }
    
     public void act()
    {
        if(jugador.getTouchMeta())
            Greenfoot.setWorld(mundo3);
    
    }
    
    public void insertarJugador()
    {
        addObject(jugador, 100,550);
    }
    
  

  public void insertarMounstro()
  {
     addObject(new mounstruo(), 300,550);
     addObject(new mounstruo1(), 470,550);
      addObject(new mounstruo1(), 470,550);
       addObject(new mounstruo2(), 470,550);
       //addObject(new mounstruo2(), 540,550);
      // addObject(new mounstruo3(), 850,550);
       addObject(new mounstruo(), 600,550);
  addObject(new mounstruo(), 750,550);
  addObject(new mounstruo2(), 770,550);
       
    }

      public void insertarMeta()
  {
       addObject(new Meta(), 890,460);
    }
    
        public void detenM(GreenfootSound m)
    {
        m.stop();
    
}
}
