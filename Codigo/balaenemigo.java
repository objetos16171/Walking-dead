import greenfoot.*;

/**
 * Funcion balaenemigo es para los ataques que van a lanzar los monstruos.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balaenemigo extends Actor
{
    /**
     * Act - do whatever the balaenemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public int band_dir = 2;
    public balaenemigo(int d)
    {
        if(d!=0)
        {
            band_dir = d;
        }
        else
        {
            band_dir = 2; 
        }
    }

    public void act() 
    {
        muevete();// Add your action code here.
        
        //if(isTouching(Jugador.class))
        //{
           //removeTouching(Jugador.class);

            //getWorld().addObject(new morire(),300,200);
            //Greenfoot.stop();}

       
     
    }

    protected void muevete()
    {
        int band = Greenfoot.getRandomNumber(2);
        int x = getX(), y = getY();
        if(band_dir == 1)
        {
            switch(band)
            {
                case 1:
                setImage("bomb.png");
                setLocation(x+20,y);
                break;
            }
            if(isAtEdge())
            {
            getWorld().removeObject(this);
            }
        }
        if(band_dir == 2)
        {
            switch(band)
            {
                case 1:
                setImage("bomb.png");
                setLocation(x-20,y);
                break;
            }
            /*if(isAtEdge())
            {
            getWorld().removeObject(this);
            }
            }*/

        }

    }
    private void checkCollide()
    {
        Actor a = this.getOneIntersectingObject(Jugador.class);
        Actor b = this.getOneIntersectingObject(bala.class);
        if(a != null )
        {
            
            //getWorld().removeObject(this);
            this.getWorld().removeObject(a);
            
        }
       if(b != null )
        {
            getWorld().removeObject(this);
            this.getWorld().removeObject(b);
        }
    }
    

    public boolean atWorldEdge()
    {
        if (getX() > getWorld().getWidth() - getImage().getWidth() || getY() > getWorld().getHeight() - getImage().getHeight())    

        {    
            return true;    
        }    
        else   
        {    
            return false;
        }    
 
}
public void eliminar()
{
if(atWorldEdge()==true)
        {
            getWorld().removeObject(this);
        }
 }       
        }
        
// Add your action code here.
