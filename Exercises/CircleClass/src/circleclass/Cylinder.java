/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleclass;

/**
 *
 * @author User
 */
public class Cylinder  extends Circle{
    private double height;
    
    public Cylinder(){
        super();
        height = 1;  
    }
    
    public Cylinder(double h){
        super();
        height = h;
    }
    
    public Cylinder(double r, String c, double h){
        super();
        height = h;
    }
    
    public double getHeight(){
        return height;
    }   
    
   public void setHeight(double h){
       height = h;
   }
   
    @Override
   public double getArea(){
        return (2*Math.PI * getRadius() * height)+(2*getArea());
   }
   
   public double getVolume(){
       return getArea() * height;
   }
   
    @Override
   public String toString(){
       return "Cylinder: subclass of " + super.toString() + "height: " +  height;
   }
}
