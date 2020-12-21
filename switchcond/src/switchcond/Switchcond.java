/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcond;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Switchcond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month;
        String word = null;
        month = input.nextInt();
        
        switch (month){
            case 1: word = "January";break;
            case 2: word = "February";break;
            case 3: word = "March";break;
            case 4: word = "April";break;
            case 5: word = "March";break;
            case 6: word = "June";break;
            case 7: word = "July";break;
            case 8: word = "August";break;
            case 9: word = "September";break;
            case 10: word = "October";break;
            case 11: word = "November";break;
            case 12: word = "December";break;
            default: System.out.println("Invalid month");
        }
        System.out.println("The month is " + word);
        // TODO code application logic here
    }
    
}
