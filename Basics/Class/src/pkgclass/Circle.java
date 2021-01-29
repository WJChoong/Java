/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

/**
 *
 * @author User
 */
public class Circle {
    //method must be public unless the method only to be used internally
    private String color;
    private double radius;
    
    public Circle(){
        color = "";
        radius = 0;
    }
    public Circle(double r, String c){
        color = c;
        radius = r;
    }
    
    public void setColor(String c){  //Setter
        color = c;
    }
    
    public void setRadius(double r){  //Setter
        radius = r;
    }
    
    public String getColor(){  //Getter
        return color;
    }
    
    public double getRadius(){ //Getter
        return radius;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
