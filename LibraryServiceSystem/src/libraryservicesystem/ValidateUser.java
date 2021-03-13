/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryservicesystem;
import java.io.*;
import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class ValidateUser {
    private String user,msg, status, data, ID, filename;
    
    public ValidateUser(String userID) throws IOException{
        msg = "";
        status = "fail";
        user = userID.substring(0,2);
        System.out.println("0");
        if ((user.equals("TP")) || (user.equals("LT"))){
            if (user.equals("TP")){
                System.out.println("Gaga");
                filename = "Student.txt";
                File file = new File(filename);
                Scanner inputFile = new Scanner(file);
                status = "fail";
                System.out.println("2");
                
                while (inputFile.hasNext()){
                    System.out.println("3");
                 // Read the next line.
                    data = inputFile.nextLine();

                    // Split the line by using the delimiter ":" (semicolon) and store into array.
                    String[] details = data.split(":");
                    ID = details[0];
                    
                    if (userID.equals(ID)){
                       status = "success";
                    }
                }
            }
            else if (user.equals("LT")){
                filename = "Lecturer.txt";
                File file = new File(filename);
                Scanner inputFile = new Scanner(file);
                status = "fail";
                
                while (inputFile.hasNext()){
                 // Read the next line.
                    data = inputFile.nextLine();

                    // Split the line by using the delimiter ":" (semicolon) and store into array.
                    String[] details = data.split(":");
                    ID = details[0];
                    
                    if (userID.equals(ID)){
                       status = "success";
                    }
                }
            }
            if (status.equals("fail")){
               msg = "Invalid";
            }
        }
        else{ 
           msg="Invalid ID";
        }  
    }
    public String getMsg(){
        return msg;
    }
}
