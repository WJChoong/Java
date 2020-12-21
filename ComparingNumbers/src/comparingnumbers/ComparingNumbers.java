/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingnumbers;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ComparingNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double first, second, third;
        Scanner input = new Scanner(System.in);
        
        System.out.print("The first number: ");
        first =  input.nextDouble();
        
        System.out.print("The second number: ");
        second =  input.nextDouble();
        
        System.out.print("The third number: ");
        third =  input.nextDouble();
        
        if (first > second && first > third){
            System.out.println("The first number is the largest");
        }
        else if (second > first && second > third){
            System.out.println("The second number is the largest");
        }
        else if (third > first && third > second){
            System.out.println("The third number is the largest");
        }
        // TODO code application logic here
    }
    
}
