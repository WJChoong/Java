/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryservicesystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Register extends JFrame implements ActionListener{
    private Label lblTitle, lblUser, lblPass, lblPass2, lblError;
    private TextField txtUser, txtPass, txtPass2;
    private Button btnRegister, btnBack;
    private String username, newPass, ConPass, num_ID, ID, halfID;
    private Integer i, num;
    
    public Register()throws IOException{
        setSize(500,300);
        setLocation(500,200);//(x,y)
        setTitle("Library Service System");
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        btnRegister.addActionListener(this);
        btnBack.addActionListener(this);
        
        //set whether the frane is visible
        setVisible(true);
    }
    private void intGUI(){
        Panel pTitle = new Panel();
        Panel pUser = new Panel();
        Panel pPass = new Panel();
        Panel pPass2 = new Panel();
        Panel pButton = new Panel();
        
        pTitle.setPreferredSize(new Dimension(500, 50));
        pUser.setPreferredSize(new Dimension(500, 50));
        pPass.setPreferredSize(new Dimension(500, 50));
        pPass2.setPreferredSize(new Dimension(500, 50));
        pButton.setPreferredSize(new Dimension(500, 50));
        add(pTitle);
        add(pUser);
        add(pPass);
        add(pPass2);
        add(pButton);
        
        lblTitle = new Label("Register");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 30));
        pTitle.add(lblTitle); 
        
        lblUser = new Label("                   Name:  ");
        txtUser = new TextField("", 20);
        pUser.add(lblUser); 
        pUser.add(txtUser);
        
        lblPass = new Label("     New Password: ");
        txtPass = new TextField("", 20);
        pPass.add(lblPass); 
        pPass.add(txtPass);
        
        lblPass2 = new Label("Confirm Password: ");
        txtPass2 = new TextField("", 20);
        pPass2.add(lblPass2); 
        pPass2.add(txtPass2); 
        
        btnRegister = new Button("Register");
        btnRegister.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnRegister); 
        btnBack = new Button("Back");
        btnBack.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnBack); 
    }
    public void actionPerformed (ActionEvent e){        
        if (e.getSource() == btnBack){
            LoginPage index = new LoginPage();
            this.dispose();
        }
        else if (e.getSource() == btnRegister){
            username = txtUser.getText();
            newPass = txtPass.getText().toString();
            ConPass = txtPass2.getText().toString();
            if (newPass.equals(ConPass)){
                String filename = "Staff.txt";
                File file = new File(filename);
                Scanner inputFile = new Scanner(file);

                // Read lines from the file until no more are left.
                num = 0;
                while (inputFile.hasNext())
                {
                   // Read the next line.
                   String data = inputFile.nextLine();

                   // Split the line by using the delimiter ":" (semicolon) and store into array.
                   String[] details = data.split(":");
                   String temp = RemoveCharacter(details[0]);
                   int ID = Integer.parseInt(temp);
                   if (ID > num){
                       num = ID;
                   }
                }
                inputFile.close(); // Close the file

                FileWriter fw = new FileWriter(filename, true);
                PrintWriter outputFile = new PrintWriter(fw);
                
                num ++;
                num_ID = String.valueOf(num);
                ID = "0";
                
                if (num_ID.length() < 6){
                    for (i = 0; i < (5-num_ID.length()); i++){
                        halfID = "0";
                        ID = ID + halfID;
                    }
                    ID = "LS"+ ID + num;
                }
                else{
                    ID = "LS" + num;
                }
                
                String data = ID + ":" + username + ":" + newPass ;
                outputFile.println(data);
                outputFile.close();
                JOptionPane.showMessageDialog(null, "Successfully Created");
                }
            else {
                JOptionPane.showMessageDialog(null, "Password are not same");
            }
        }  
    } 
    private String RemoveCharacter(String r){
        return r.substring(2);
    }    
}
