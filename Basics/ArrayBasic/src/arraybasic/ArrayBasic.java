/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybasic;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class ArrayBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        
        for (int index = 0; index<numbers.length; index++){
            System.out.print("Enter a value: ");
            numbers[index]=input.nextInt();
        }
        int total =0;
            for (int indexs=0; indexs < numbers.length; indexs++){
                total = total + numbers[indexs];
            }
        System.out.println("Total is " + total);
    }
    
}
