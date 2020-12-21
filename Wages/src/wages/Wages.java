/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wages;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Wages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tax, wages;
        System.out.print("Please enter a amount: ");
        Scanner input = new Scanner(System.in);
        
        wages = input.nextDouble();
        if (wages <= 57600 ){
            tax = 0.124*wages;
        }
        else{
            tax = 0.124*57600;
        }
        
        System.out.println("Tax is " + tax);
    }
    
}
