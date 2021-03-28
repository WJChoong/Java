/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryservicesystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class ForgetPass extends JFrame implements ActionListener{
    private Label lblTitle, lblUser, lblPass, lblPass2, lblError;
    private TextField txtUser, txtPass, txtPass2;
    private Button btnLogin, btnChange;
    private String username, newPass, ConPass;
    
    public ForgetPass(){    
        setSize(500,300);
        setLocation(500,200);//(x,y)
        setTitle("Library Service System");
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        btnLogin.addActionListener(this);
        btnChange.addActionListener(this);
        
        //set whether the frane is visible
        setVisible(true);
    }
    
    //the code for GUI
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
        
        lblTitle = new Label("Change Password");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 30));
        pTitle.add(lblTitle); 
        
        lblUser = new Label("            Username:  ");
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
        
        btnLogin = new Button("Login");
        btnLogin.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnLogin); 
        btnChange = new Button("Change");
        btnChange.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnChange); 
    }
    public void actionPerformed (ActionEvent e)  {        
        if (e.getSource() == btnLogin){
            LoginPage index = new LoginPage();
            this.dispose();
        }
        else if (e.getSource() == btnChange){
            username = txtUser.getText();
            newPass = txtPass.getText().toString();
            ConPass = txtPass2.getText().toString();
            if (username.equals("") || newPass.equals("") || ConPass.equals("")){
                JOptionPane.showMessageDialog(null, "Please don't leave it blank");
            }
            else{
                if (newPass.equals(ConPass)){
                    try {
                        new ChangePassword(username, newPass);
                    } catch (IOException ex) {
                        Logger.getLogger(ForgetPass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Password are not same");
                }
            }
        }  
    }     
}
