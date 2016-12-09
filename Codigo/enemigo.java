import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemigo extends Actor
{
    int puntos;
    Label lpuntos;
    
     
    /**
     * Act - do whatever the enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public enemigo()
    {
    puntos =1;
          
        lpuntos=new Label("PUNTOS : ",30);
       
}
    public void act() 
    {
        
        
      
        
        // Add your action code here.
    } 
    public void addScore()
    {

        
       getWorld().removeObject(lpuntos);
       getWorld().addObject(new mosaico(),400,100);
         lpuntos=new Label("PUNTOS: " + Integer.toString(puntos),30);
        getWorld().addObject(lpuntos,400, 100);
         
    }
    
    
}
