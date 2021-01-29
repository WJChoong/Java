/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingloop;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReadingLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0, total = 0, average,inputvalue;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score('-1'ends the data): ");
        inputvalue = input.nextInt();
        
        int max = inputvalue;
        int min = inputvalue;
         
       while(inputvalue != -1){
            count++;       //increment
            total = total + inputvalue; //calculating the total for average
            
             //comparing the input
            if (inputvalue > max){  
                max = inputvalue;
            }
            if (inputvalue < min){
                min = inputvalue;
            }
            
            System.out.print("Enter score('-1'ends the data): "); //accepting new input
            inputvalue = input.nextInt();
        }
        average = total / count;   //calculate average
        System.out.println("The average of the " + count + " score was " + average);
        System.out.println("The maximum score was " + max);
        System.out.println("The minumum score was " + min);
    }
}
