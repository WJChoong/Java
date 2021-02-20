package libraryservicesystem;
import java.awt.*;
import javax.swing.*;

public class LoginLecturer extends JFrame{
    public LoginLecturer(){
        setSize(600,500);
        setLocation(100,100);
        setTitle("Library Service System"); 
        setLayout(new FlowLayout(FlowLayout.CENTER,20, 20));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        
        setVisible(true);//whether the frane is visible
    }
    private void intGUI(){
        //title
        Label lblLogin = new Label("Login");
        lblLogin.setFont(new java.awt.Font("Times New Roman", 1, 30));
        lblLogin.setSize(500, 100);
        add(lblLogin);
        
        //username section
        Label lblUsername = new Label("Username: ");
        lblUsername.setFont(new java.awt.Font("Times New Roman", 4, 15));
        lblUsername.setSize(150, 100);
        TextField txtUsername = new TextField(20); 
        txtUsername.setFont(new java.awt.Font("Times New Roman", 4, 15));
        txtUsername.setSize(150, 100);
        add(lblUsername);
        add(txtUsername);
        
        //password section
        Label lblPassword = new Label("Password: ");
        lblPassword.setFont(new java.awt.Font("Times New Roman", 4, 15));
        lblPassword.setSize(150, 100);
        TextField txtPassword = new TextField(20); 
        txtPassword.setFont(new java.awt.Font("Times New Roman", 4, 15));
        txtPassword.setSize(150, 100);
        add(lblPassword);
        add(txtPassword);

        //Login Button
        Button btnLogin = new Button("Login");
        add(btnLogin); 
        
        //Clear Button
        Button btnClear = new Button("Clear");
        add(btnClear); 
    }
    private void dialog(){
        JDialog d = new JDialog(this, "java.awt.Dialog", true);
        d.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        d.setSize(200,100);
        d.setLocation(120,120);
        d.setVisible(true);
    }
}

