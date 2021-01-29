/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] array = new double[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Please enter a number: ");
            Scanner num = new Scanner(System.in);
            double numbers = num.nextDouble();
            array[i] = numbers;
        }
        for (int i = 0; i < 5; i++){
            double numbers = array[i];
            if (numbers < 100 & numbers > 0){
                System.out.println("Numbers: " + numbers);
            }
        }
        
    }
    
}
