/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryservicesystem;
import java.io.*;
import java.util.Scanner; 
/**
 *
 * @author User
 */
public class LoginAction {
    
    public LoginAction(String user,String password)throws IOException{
        String filename = "Staff.txt";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        String status = "fail";
        
        while (inputFile.hasNext()){
         // Read the next line.
            String friendName = inputFile.nextLine();

            // Split the line by using the delimiter ":" (semicolon) and store into array.
            String[] details = friendName.split(":");
            String ID = details[0];
            String pass = details[2].toString();
            
            if ((user.equals(ID))&&(password.equals(pass))){
               status = "success";
            }
            else {
               
            }
        }
        
        if (status == "success"){
            ActionPage index = new ActionPage();
        }
        else if (status == "fail"){
            
        }
    }
}
