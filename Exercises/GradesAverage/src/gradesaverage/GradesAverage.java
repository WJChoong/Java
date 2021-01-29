/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradesaverage;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class GradesAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = inp.nextInt();
        
        int[] grades = new int[numStudents];
        for (int i = 0; i < numStudents; i++){
            int status = 0;
            while (status ==0){
                System.out.print("Enter the grade for student " + (i+1) + ": " );
                int marks = inp.nextInt();
                
                if (marks > 0 & marks < 100){
                    grades[i] = marks;
                    status = 1;
                }
                else{
                    System.out.println("Invalid grades. Please try ahain...");
                }
            }
        }
        int total = 0;
        for (int i = 0; i < numStudents; i++){
            total = total + grades[i];
            System.out.println(grades[i]);
        }
        double average = total/numStudents;
        System.out.println("The average is " + average);
        
    }
    
}
