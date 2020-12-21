/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;
import java.util.Scanner; //import the scanner function to get input
/**
 *
 * @author User
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double width, length, perimeter, area;
        
        //System.in is to receive input from keyboard
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter wdith: ");
        width = inp.nextDouble();
        System.out.print("Enter length: ");
        length = inp.nextDouble(); //the input will be in double form
        area = width * length;
        perimeter = 2* (width + length);
        
        System.out.printf("Area is %.2f %n",area); //printf for pnt format
        System.out.println("Perimeter is "+ perimeter);
    }
    
}
