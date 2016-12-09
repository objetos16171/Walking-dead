import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigo_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mounstruo1 extends enemigo
{
  private int rand=Greenfoot.getRandomNumber(400);
    private int dir = 1;
    private int cont = 0;
    private int jump = -16;
    private int verticalSpeed = 10;
   
    /**
     * Act - do whatever the enemigo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public mounstruo1()
    {
        puntos = 1;

        lpuntos=new Label("PUNTOS : 0",30);
        
    }
    public void act() 
    {
        // Add your action code here.
        mov_rand();
        muevete();
        cont ++;
        checkFall();
        
        
        
      
        if(isTouching(bala1.class))
        {
            removeTouching(bala1.class);
            puntos++;
            
            
             removeTouching(mounstruo1.class);
            addScore();
            }
             if(isTouching(bala2.class))
        {
            removeTouching(bala2.class);
            puntos=puntos+2;
            
            
             removeTouching(mounstruo1.class);
            addScore();
            }
            if(isTouching(bala3.class))
        {
            removeTouching(bala3.class);
            puntos=puntos+3;
            
            
             removeTouching(mounstruo1.class);
            addScore();
            }
            addScore();
            
            
                
    }
               
/**
 * esta funcion sirve para que el mosntruo se este moviendo aleatoriamente
 * dentro del escenario.
 */
    public void mov_rand()
    {
        int accion=Greenfoot.getRandomNumber(50);
        if(accion==1)
        {
            muevete();
        }
        if(accion==2)
        {
            muevete();
        }
        if(cont==50)
        {
            dispara();
            cont = 0;
        }
        if(accion==4)
        {
            salta();
        }
    }
    private void muevete()
    {
        int band_dir = Greenfoot.getRandomNumber(40);
        int mov = 0;
        switch(band_dir)
        {
            case 1:
            setImage("enemigo1.png");
            setLocation(getX()+20,getY());
            mov = 1;
            break;
            case 2:
            setImage("enemigo1.png");
            setLocation(getX()-20,getY());
            mov = 2;
            break;
        }
        dir = mov;
    }
    

    private void dispara()
    {
        int band = 0;
        if (dir!=0)
        {
            band = dir;
        }
        getWorld().addObject(new balaenemigo(band),getX(),getY()-25);
    }
    protected void salta()
    {
            if(onGround())
            {
                verticalSpeed = jump; 
                fall();                
            }
    }
    private void fall()
    {
        setLocation(getX(),getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + 2;
    }

    private boolean onGround()
    {
        if(getY()>=550)
            return true;
        else
            return false;
    }

    private void checkFall()
    {
        if(onGround())
            verticalSpeed = 0;
        else
            fall();
    }
}