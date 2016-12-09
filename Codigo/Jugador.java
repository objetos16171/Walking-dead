import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    private int speed = 5;
    private int verticalSpeed = 0;
    private int exel = 2;
    private int jump = -16;
    private int floor=544;
    private final int left=1;
    private final int right=2;
    private int dir=right;
    private int pasos = 1;
    private boolean tocaMeta;
    
    int vidas= 3;
    Label lVidas;
    
    
    
   public Jugador()
   {
      
       pasos = 1;
       tocaMeta = false;
      // vidas =3;
           
        lVidas=new Label("VIDAS : 3",30);
       

   }
     
    public void act() 
    {
        keyCheck();
        checkFall();
        getWorld().removeObject(lVidas);
        lVidas=new Label("VIDAS: " + Integer.toString(vidas),30);
        
        getWorld().addObject(lVidas,200, 100);
        
        
         if(isTouching(comida.class))
        {
            removeTouching(comida.class);
            vidas++;
            
            }
        if(isTouching(balaenemigo.class))
        {
            removeTouching(balaenemigo.class);
            vidas--;
            
            
            if(vidas<=0)
            {
             removeTouching(Jugador.class);
         
           getWorld().addObject(new perdiste(),300,200);
            removeTouching(balaenemigo.class);
            Greenfoot.stop();
            
            }

           

        }
       
        if(isTouching(Meta.class))
        {
           tocaMeta = true;
        }
       
           
        //System.out.println(pasos);
    }

    public boolean getTouchMeta()
    {
        return tocaMeta;
    }
    
    /**
     * Key Check
     */
    private void keyCheck()
    {
        int direc = 1;
        int balas = 0;
        
        
        if(Greenfoot.isKeyDown("F"))
        {
            getWorld().addObject(new bala1(direc),getX()+35,getY()-32);
            Greenfoot.delay(10);
            
        }
    
    
        
        if(Greenfoot.isKeyDown("Q"))
        {
            getWorld().addObject(new bala2(direc),getX()+35,getY()-32);
            Greenfoot.delay(10);
            
        }
    
            
            if(Greenfoot.isKeyDown("W"))
        {
            getWorld().addObject(new bala3(direc),getX()+35,getY()-32);
            Greenfoot.delay(10);
            
        }
    
          
       if(Greenfoot.isKeyDown("right"))  
        {  
            dir=right; 
            if(pasos==1)
            {
                setLocation ( getX() + speed, getY() );
                if(onGround())
                    setImage("jugador2.png");
                else
                    setImage("jugador1.png");
            }
            if(pasos==2)
            {
                setLocation( getX() + speed, getY() );
                if(onGround())
                    setImage("jugador3.png");      
                else
                    setImage("jugador1.png");
            }
            if(pasos==3)
            {
                setLocation( getX() + speed, getY() );
                if(onGround())
                    setImage("jugador2.png");
                else
                    setImage("jugador1.png");
            }
            if(pasos>=3)
                pasos=1;
            else
                pasos++;
                direc = 1;
            }
      
          
        if(Greenfoot.isKeyDown("left"))  
        {  
            dir=left; 
            if(pasos==1)
            {
                setLocation ( getX() - speed, getY() );
                if(onGround())
                    setImage("jug2.png");
                else
                    setImage("jug1.png");
            }
            if(pasos==2)
            {
                setLocation( getX() - speed, getY() );
                if(onGround())
                    setImage("jug3.png");      
                else
                    setImage("jug1.png");
            }
            if(pasos==3)
            {
                setLocation( getX() - speed, getY() );
                if(onGround())
                    setImage("jug2.png");
                else
                    setImage("jug1.png");
            }
            if(pasos>=3)
                pasos=1;
            else
                pasos++;
                direc =2;
        }  
          
        if(Greenfoot.isKeyDown("up"))  
        {  
            if(onGround())
            {
                verticalSpeed = jump; 
                fall();                
            }
        }
        
    }
    
    public int getJugadorDir()
    {
        return(dir);
    }
    
    /**
     * Fall
     */
    private void fall()  
    {  
        setLocation (getX(), getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + exel;  
    }
    
    /**
     * On Ground
     */
    private boolean onGround()  
    {  
        if(getY()>=floor)
            return true;
        else
            return false;
    }
    
    /**
     * Check Fall
     */
    private void checkFall()  
    {  
        if(onGround()) 
            verticalSpeed=0;
        else
            fall();
  
    } 
  
}
    
   
  
   
