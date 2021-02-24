/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accumulated.sum;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author User
 */
public class myFrame extends JFrame implements ActionListener{
    private Label lblint, lblsum;
    private TextField txtint, txtsum;
    int num, sum = 0;
    
    public myFrame(){
        setSize(300,100);// (width, height)
        setLocation(100,200);//(x-coordinate,y-coordinate)
        setTitle("Accumulated Sum"); //the title of the window
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblint = new Label("Enter an integer");
        txtint = new TextField(10);
        add(lblint);
        add(txtint);

        
        lblsum = new Label("Accumulated sum is ");
        txtsum = new TextField(10);
        add(lblsum);
        add(txtsum);
        
        txtint.addActionListener(this);
        
        setVisible(true);//whether the frane is visible
    }
    public void actionPerformed (ActionEvent e)  {
        num =  Integer.parseInt(txtint.getText());
        sum = sum + num;
        txtint.setText("");
        txtsum.setText(String.valueOf(sum));
    }
}
