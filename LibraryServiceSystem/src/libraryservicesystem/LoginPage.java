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
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class LoginPage extends JFrame implements ActionListener{
    private Label lblTitle, lblUser, lblPass;
    private TextField txtUser, txtPass;
    private Button btnLogin, btnForget;
    private String username, password;
    
    public LoginPage(){    
        setSize(500,300);
        setLocation(500,200);//(x,y)
        setTitle("Library Service System");
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
        intGUI();
        btnLogin.addActionListener(this);
        btnForget.addActionListener(this);
        
        //set whether the frane is visible
        setVisible(true);
    }
    
    //the code for GUI
    private void intGUI(){
        Panel pTitle = new Panel();
        Panel pUser = new Panel();
        Panel pPass = new Panel();
        Panel pButton = new Panel();
        
        pTitle.setPreferredSize(new Dimension(500, 50));
        pUser.setPreferredSize(new Dimension(500, 50));
        pPass.setPreferredSize(new Dimension(500, 50));
        pButton.setPreferredSize(new Dimension(500, 50));
        add(pTitle);
        add(pUser);
        add(pPass);
        add(pButton);
        
        lblTitle = new Label("Login");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 30));
        pTitle.add(lblTitle); 
        
        lblUser = new Label("Username: ");
        txtUser = new TextField("", 20);
        pUser.add(lblUser); 
        pUser.add(txtUser);
        
        lblPass = new Label("Password: ");
        txtPass = new TextField("", 20);
        pPass.add(lblPass); 
        pPass.add(txtPass);
        
        btnLogin = new Button("Login");
        btnLogin.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnLogin); 
        btnForget = new Button("Forget Password");
        btnForget.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnForget); 
    }
    @Override
    public void actionPerformed (ActionEvent e) {        
        if (e.getSource() == btnLogin){
            username = txtUser.getText();
            password = txtPass.getText().toString();
            try {
                new LoginAction(username,password);
            } catch (IOException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (e.getSource() == btnForget){
            ForgetPass index = new ForgetPass();
        }  
    }
    
}
