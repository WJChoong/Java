/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int count = 0;
        int total = 0, inputvalue;
        
        do{
            System.out.print("Enter your value: ");
            inputvalue = input.nextInt();
            count++;
            
            total = total + inputvalue;
        }while (count < 5);
        System.out.println("The total is " + total);
    }
    
}
