import greenfoot.*;

/**
 * Write a description of class Facturamamundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo1 extends World
{
    /**
     */
 
    
     private Jugador jugador;
    private Mundo2 mundo2;
    
   
public Mundo1()
{
    super(900, 600, 1);
        jugador = new Jugador();
        insertarJugador();
        insertarMounstro();
        Greenfoot.delay(100);
        insertarMounstro();
       
        insertarMeta();
        insertarComida();
        mundo2 = new Mundo2();
        //ene= new enemigo();
        Greenfoot.playSound("Zombie2.mp3");
    }
    
    public void act()
    {
        if(jugador.getTouchMeta())
            Greenfoot.setWorld(mundo2);
            
    
    }
    
    public void cambiaMundo()
    {
        Greenfoot.setWorld(mundo2);
    }
    
    public void insertarJugador()
    {
         addObject(new enemigo(), 200, 100);
        addObject(jugador, 100,550);
    }

  public void insertarMounstro()
  {
     
      addObject(new mounstruo(), 400,550);
      addObject(new mounstruo1(), 650,550);
      addObject(new mounstruo1(), 750,550);
      addObject(new mounstruo(), 800,550);
      addObject(new mounstruo1(), 400,550);
       addObject(new mounstruo(), 470,550);
       addObject(new mounstruo(), 540,550);
       addObject(new mounstruo(), 850,550);
       
    }

      public void insertarMeta()
  {
       addObject(new Meta(), 900,460);
    }
    
        public void detenM(GreenfootSound m)
    {
        m.stop();
    
}
public void insertarComida()
      {
      
       addObject(new comida(), 230,450);
       addObject(new comida(), 530,450);
    
       }

}

   

    
