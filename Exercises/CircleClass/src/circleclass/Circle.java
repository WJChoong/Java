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
public class Circle extends Shape{
    private double radius;
    
    public Circle(){
        super();
        radius = 1.0;
    }
    
    public Circle(double r){
        super();
        radius =r;
    }
    
     public Circle(double r, String c, boolean f){
         setColor(c);
         isFilled(f);
         radius =r;
    }
    
     //To retrieve a value
    public double getRadius(){
        return radius;
    }
    
    //To set the value
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    public double setPerimeter(){
        return 2* Math.PI * radius;
    }
    
    //To String Method
    public String toString(){
        return "Circle: radius=" + radius + " color = " + color;
    }
}
