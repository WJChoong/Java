/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryservicesystem;
import java.io.*;
import java.util.Scanner; 
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class ChangePassword {
    String sameID, sameName, oldPass, status;
    
    public ChangePassword(String user, String newPass)throws IOException{
        String filename = "Staff.txt";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        status = "fail";
        
        while (inputFile.hasNext()){
         // Read the next line.
            String friendName = inputFile.nextLine();

            // Split the line by using the delimiter ":" (semicolon) and store into array.
            String[] details = friendName.split(":");
            sameID = details[0];
            sameName = details[1];
            oldPass = details[2];
            
            if (user.equals(sameID)){
                // TODO code application logic here
                String filePath = "D:/Code/Java/LibraryServiceSystem/Staff.txt";
                //Instantiating the Scanner class to read the file
                Scanner sc = new Scanner(new File(filePath));
                //instantiating the StringBuffer class
                StringBuffer buffer = new StringBuffer();
                //Reading lines of the file and appending them to StringBuffer
                while (sc.hasNextLine()) {
                   buffer.append(sc.nextLine()+System.lineSeparator());
                }
                String fileContents = buffer.toString();
                System.out.println("Contents of the file: "+fileContents);
                //closing the Scanner object
                sc.close();
                String oldLine = sameID + ":" + sameName + ":" + oldPass;
                String newLine = sameID + ":" + sameName + ":" + newPass;
                //Replacing the old line with new line
                fileContents = fileContents.replaceAll(oldLine, newLine);
                //instantiating the FileWriter class
                FileWriter writer = new FileWriter(filePath);
                writer.append(fileContents);
                writer.flush();  
                status = "pass";
            }
        }
        if (status.equals("fail")){
            JOptionPane.showMessageDialog(null, "Invelid User");
        }
        else if (status.equals("pass")){
            JOptionPane.showMessageDialog(null, "Password successfully changed");
        }
    }
}
