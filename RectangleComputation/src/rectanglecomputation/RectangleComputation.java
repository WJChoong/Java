/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglecomputation;

/**
 *
 * @author User
 */
public class RectangleComputation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int length, width, area, perimeter;
        
        length = 10;
        width = 20;
        area = width * length;
        perimeter = (2*width) + (2*length);
        
        System.out.println("Area is " + area );
        System.out.println("Perimeter is " + perimeter );
    }
    
}
