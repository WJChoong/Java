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
public class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        color = "red";
        filled = true;
    }
    
    public Shape(String c, boolean f){
        color = c;
        filled = f;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void isFilled(boolean f){
        filled = f;
    }
    
    public String toString(){
        return "The color is " + color + "and" +(filled?"filled":"is not filled");
    }
}
