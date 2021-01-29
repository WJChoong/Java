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
public class CircleClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        
        Circle c2 = new Circle(2);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        
        Circle c3 = new Circle(10,"pink");
        System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea());
        
        System.out.println(c3);//Calling toString automatically
    }
    
}
