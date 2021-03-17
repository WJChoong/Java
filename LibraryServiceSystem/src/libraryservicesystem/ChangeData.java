/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryservicesystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class ChangeData {
    String data1, data2, data3, data4, data5,data6;
    public ChangeData(String userID, String bookID) throws IOException{
        String filename = "Loan.txt";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()){
        // Read the next line.
           String friendName = inputFile.nextLine();

           // Split the line by using the delimiter ":" (semicolon) and store into array.
           String[] details = friendName.split(":");
           data1 = details[0];
           data2 = details[1];
           data3 = details[2];
           data4 = details[3];
           data5 = details[4];
           data6 = details[5];

            if ((userID.equals(data2)) && (bookID.equals(data3)) && (data6.equals("Loaned"))){
               // TODO code application logic here
                String filePath = "D:/Code/Java/LibraryServiceSystem/Loan.txt";
                //Instantiating the Scanner class to read the file
                Scanner sc = new Scanner(new File(filePath));
                //instantiating the StringBuffer class
                StringBuffer buffer = new StringBuffer();
                //Reading lines of the file and appending them to StringBuffer
                while (sc.hasNextLine()) {
                   buffer.append(sc.nextLine()+System.lineSeparator());
                }
                String fileContents = buffer.toString();
                //closing the Scanner object
                sc.close();
                String oldLine = data1 + ":" + data2 + ":" + data3 + ":" + data4 + ":" + data5 + ":" + data6;
                String newLine = data1 + ":" + data2 + ":" + data3 + ":" + data4 + ":" + data5 + ":" + "Returned";
                //Replacing the old line with new line
                fileContents = fileContents.replaceAll(oldLine, newLine);
                //instantiating the FileWriter class
                FileWriter writer = new FileWriter(filePath);
                writer.append(fileContents);
                writer.flush();  
                JOptionPane.showMessageDialog(null, "The book had successfully returned");
            }
        }
    }
    public ChangeData(String userID, String bookID,LocalDate date) throws IOException{
        String filename = "Loan.txt";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()){
        // Read the next line.
           String friendName = inputFile.nextLine();

           // Split the line by using the delimiter ":" (semicolon) and store into array.
           String[] details = friendName.split(":");
           data1 = details[0];
           data2 = details[1];
           data3 = details[2];
           data4 = details[3];
           data5 = details[4];
           data6 = details[5];           
           
            if ((userID.equals(data2)) && (bookID.equals(data3)) && (data6.equals("Loaned"))){
                // TODO code application logic here
                String filePath = "D:/Code/Java/LibraryServiceSystem/Loan.txt";
                //Instantiating the Scanner class to read the file
                Scanner sc = new Scanner(new File(filePath));
                //instantiating the StringBuffer class
                StringBuffer buffer = new StringBuffer();
                //Reading lines of the file and appending them to StringBuffer
                while (sc.hasNextLine()) {
                   buffer.append(sc.nextLine()+System.lineSeparator());
                }
                String fileContents = buffer.toString();
                //closing the Scanner object
                sc.close();
                String oldLine = data1 + ":" + data2 + ":" + data3 + ":" + data4 + ":" + data5 + ":" + data6;
                String newLine = data1 + ":" + data2 + ":" + data3 + ":" + data4 + ":" + date + ":" + data6;
                //Replacing the old line with new line
                fileContents = fileContents.replaceAll(oldLine, newLine);
                //instantiating the FileWriter class
                FileWriter writer = new FileWriter(filePath);
                writer.append(fileContents);
                writer.flush();  
            }
        }
    }
}
