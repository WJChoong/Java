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
public class MyPointClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyPoint p1 = new MyPoint(3,0);
        MyPoint p2 = new MyPoint(0,4);
        
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5,6));
        System.out.println(p1);
        
        MyPoint[] points = new MyPoint[10];
        for (int i=0; i<points.length; i++){
            points[i] = new MyPoint(i+1, i+1);
            System.out.println(points[i]);
        }
    }
    
}
