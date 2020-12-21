/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Ticket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cost;
        int age;
        
        System.out.print("Enter your age: ");
        Scanner input =  new Scanner(System.in);
        
        age = input.nextInt();
        if (age < 5 ){
            cost = 0;
        }
        else if (age >= 65){
            cost = 1.5;
        }
        else{
            cost = 2.5;
        }
        
        System.out.println("The price is $" + cost);
        // TODO code application logic here
    }
    
}
