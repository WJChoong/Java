/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grading.system;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class GradingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double testscore;
        String grade;  
        System.out.print("What is you score: ");
        Scanner input = new Scanner(System.in);
        testscore = input.nextDouble();
        
        if(testscore >= 70 && testscore <=100)
            grade = "A";
        else if (testscore >= 60)
            grade = "B";
        else if (testscore >= 50)
            grade = "C";
        else if (testscore >= 40)
            grade = "D";
        else if (testscore >= 30)
            grade = "E";
        else
            grade = "F";
        
        System.out.println("Your grade is " + grade);
    }
    
}
