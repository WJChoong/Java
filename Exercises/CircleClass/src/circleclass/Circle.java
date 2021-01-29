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
public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double r){
        radius =r;
        color = "r";
    }
    
     public Circle(double r, String c){
        radius =r;
        color = c;
    }
    
     //To retrieve a value
    public double getRadius(){
        return radius;
    }
    
    public String getColor(){
        return color;
    }
    
    //To set the value
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setColor(String r){
        color = c;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    //To String Method
    public String toString(){
        return "Circle: radius=" + radius + " color = " + color;
    }
}
