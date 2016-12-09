
    import greenfoot.*;

/**
 import greenfoot.*;

/**
 * Write a description of class Facturamamundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo3 extends World
{
    /**
     * Constructor for objects of class Facturamamundo.
     * 
     */
  
    private Jugador jugador;
    private Portada portada;
    public Mundo3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        jugador= new Jugador();
        portada = new Portada();
        insertarJugador();
        insertarMounstro();
        insertarMeta();
       
        Greenfoot.playSound("Zombie3.mp3");
    }
    public void insertarJugador()
    {
        addObject(jugador, 100,550);
    }
    
    public void act()
    {
        if(jugador.getTouchMeta())
           Greenfoot.setWorld(portada);
    
    }
    
    public void insertarNave()
    {
        
    }

  public void insertarMounstro()
  {
       addObject(new mounstruo(), 400,550);
       addObject(new mounstruo1(), 470,550);
       addObject(new mounstruo2(), 540,550);
       addObject(new mounstruo(), 850,550);
      // addObject(new mounstruo4(), 660,550);
      addObject(new mounstruo(), 600,550);
      addObject(new mounstruo(), 750,550);
      addObject(new mounstruo(), 450,550);
       addObject(new mounstruo2(), 740,550);
     addObject(new mounstruo2(), 840,550);
       
       
    }

      public void insertarMeta()
  {
       addObject(new Meta(), 900,460);
    }
    
        public void detenM(GreenfootSound m)
    {
        m.stop();
    
}
}
