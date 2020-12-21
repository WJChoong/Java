/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cal, fah;
        System.out.print("Please enter the temperature: ");
        Scanner input = new Scanner(System.in);
        
        fah = input.nextDouble();
        cal = 5*(fah - 32)/9;
        if (cal > 75){
           System.out.print("It's " + cal + " celcius");
           System.out.println("Its exceeded 75 degree Celcius.");
        }
        else{
            System.out.println("It's " + cal + " celcius");
        }
    }
    
}
