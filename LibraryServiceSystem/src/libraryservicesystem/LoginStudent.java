package libraryservicesystem;
import java.awt.*;
import javax.swing.*;

public class LoginStudent extends JFrame{
    public LoginStudent(){
        setSize(500,500);
        setLocation(100,100);
        setTitle("Library Service System"); 
        setLayout(new BorderLayout(5,5));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        
        setVisible(true);//whether the frane is visible
    }
    private void intGUI(){
        //create panel to align interface
        Panel pTitle = new Panel();
        Panel pLogin = new Panel();
        add(pTitle,"North");
        add(pLogin,"Center");
        
        //subpanels for pLogin
        Panel pUsername = new Panel();
        Panel pPassword = new Panel();
        Panel pButtons = new Panel();
        pButtons.setBackground(Color.LIGHT_GRAY);
        pLogin.add(pUsername);
        pLogin.add(pPassword);
        pLogin.add(pButtons);
        
        
        //title
        Label lblTitle = new Label("Login");
        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 30));
        lblTitle.setSize(500, 100);
        pTitle.add(lblTitle);
        
        //username section
        Label lblUsername = new Label("Username: ");
        lblUsername.setFont(new java.awt.Font("Times New Roman", 4, 15));
        lblUsername.setSize(150, 100);
        TextField txtUsername = new TextField(20); 
        txtUsername.setFont(new java.awt.Font("Times New Roman", 4, 15));
        txtUsername.setSize(150, 100);
        pUsername.add(lblUsername);
        pUsername.add(txtUsername);
        
        //password section
        Label lblPassword = new Label("Password: ");
        lblPassword.setFont(new java.awt.Font("Times New Roman", 4, 15));
        lblPassword.setSize(150, 100);
        TextField txtPassword = new TextField(20); 
        txtPassword.setFont(new java.awt.Font("Times New Roman", 4, 15));
        txtPassword.setSize(150, 100);
        pPassword.add(lblPassword);
        pPassword.add(txtPassword);

        //Login Button
        Button btnLogin = new Button("Login");
        pButtons.add(btnLogin); 
        
        //Clear Button
        Button btnClear = new Button("Clear");
        pButtons.add(btnClear); 
    }
    private void dialog(){
        JDialog d = new JDialog(this, "java.awt.Dialog", true);
        d.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        d.setSize(200,100);
        d.setLocation(120,120);
        d.setVisible(true);
    }
}
