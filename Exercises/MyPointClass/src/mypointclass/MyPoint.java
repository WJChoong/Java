/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypointclass;

/**
 *
 * @author User
 */
public class MyPoint {
    private int x;
    private int y;
    
    public MyPoint(){
        x = 0;
        y = 0;
    }
    
    public MyPoint(int cox, int coy){
        x = cox;
        y = coy;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "The coordinates is (" + x + ", " + y + ")";        
    }   
    
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff* yDiff);
    }
    
    public double distance(MyPoint p){
        int xDiff = this.x - p.x;
        int yDiff = this.y - p.y;
        return Math.sqrt(xDiff * xDiff + yDiff* yDiff);
    }
}
