/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int total = 0, inputvalue;
        
        for (int count = 0; count < 5; count++){
            System.out.print("Enter your value: ");
            inputvalue = input.nextInt();
            
            if (inputvalue<0){
                break;
            }

            total = total + inputvalue;
        }
        System.out.println("The total is " + total);
    }
    
}
