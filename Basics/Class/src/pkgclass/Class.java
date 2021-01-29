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
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        Circle c4 = new Circle(5, "Pink");
        
        c1.setRadius(10);
        c1.setColor("Red");
        
        c2.setRadius(20);
        c2.setColor("Black");
        
        System.out.println(c1.getColor());
        System.out.println(c2.getArea());
        Greeting welcome = new Greeting();
        welcome.greet("me");
        System.out.println(c3.getRadius());
        System.out.println(c4.getRadius());
    }
    
}
