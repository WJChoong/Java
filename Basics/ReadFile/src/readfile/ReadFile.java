/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;
import java.util.Scanner;
import java.io.*; 
/**
 *
 * @author User
 */
public class ReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
            // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the filename.
      System.out.print("Enter the filename: ");
      String filename = keyboard.nextLine();

      // Open the file.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      
      // Read lines from the file until no more are left.
      while (inputFile.hasNext())
      {
         // Read the next line.
         String friendName = inputFile.nextLine();

         // Split the line by using the delimiter ":" (semicolon) and store into array.
         String[] details = friendName.split(":");
         int ID = Integer.parseInt(details[0]);
         String name = details[1];

         System.out.println("ID No: " + ID);
         System.out.println("Name: " + name);
      }

      inputFile.close(); // Close the file
    }
    
}
