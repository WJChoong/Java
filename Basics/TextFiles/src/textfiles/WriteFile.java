/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiles;
import java.util.Scanner;
import java.io.*; 
/**
 *
 * @author User
 */
public class WriteFile {
    
    public static void WriteFile() throws IOException{
    String filename;         // File name
      String friendName;    // Friend's name
      int numFriends;         // Number of friends

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the number of friends.
      System.out.print("How many friends do you have? ");
      numFriends = keyboard.nextInt();

      // Consume the remaining newline character.
      keyboard.nextLine();
      
      // Get the filename.
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();

      // Open the file.
      FileWriter fw = new FileWriter(filename, true);
      PrintWriter outputFile = new PrintWriter(fw);

      // Get data and write it to the file.
      for (int i = 1; i <= numFriends; i++) {
         // Get the name of a friend.
         System.out.print("Enter the name of friend number " + i + ": ");
         friendName = keyboard.nextLine();

         // Write the name to the file.
         outputFile.println(i + ":" + friendName);//if .csv: exel file, use ":" instead of ","
      }

      outputFile.close(); // Close the file.
      System.out.println("Data written to the file.");

    }
}
