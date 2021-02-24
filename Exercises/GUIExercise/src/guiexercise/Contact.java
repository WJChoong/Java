/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexercise;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class Contact extends JFrame{
    public Contact(){
        setSize(400,150);// (width, height)
        setLocation(100,200);//(x-coordinate,y-coordinate)
        setTitle("Contact"); //the title of the window
        setLayout(new BorderLayout(0,0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        
        setVisible(true);//whether the frane is visible
    }
    private void intGUI(){        
        //Create panel
        Panel pCon = new Panel();
        Panel pName = new Panel();
        Panel pPhone = new Panel();
        Panel pButtons = new Panel();
        
        //Add panels
        add(pCon,"Center");
        add(pButtons, "South");
        pCon.add(pName);
        pCon.add(pPhone);
        
        pCon.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
       
     //Name Section
        Label lblName = new Label("Name: ");
        TextField txtName = new TextField(20);
        pName.add(lblName); 
        pName.add(txtName);
     
     //Phone Section
        Label lblPhone = new Label("Phone: ");
        TextField txtPhone = new TextField(20);
        pPhone.add(lblPhone); 
        pPhone.add(txtPhone);
        
     //Buttons Section
        //Apply Layout
        pButtons.setLayout(new GridLayout(1,0,0,0));
        
        //Creating buttons for button panel
        Button btnSave = new Button("Save");
        Button btnSeach = new Button("Search");
        Button btnExit = new Button("Exit");
        
        //adding Buttons into panel
        pButtons.add(btnSave);
        pButtons.add(btnSeach);
        pButtons.add(btnExit);
    }
}
