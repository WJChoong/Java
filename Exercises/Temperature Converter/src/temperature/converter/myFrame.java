/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature.converter;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class myFrame extends JFrame implements ActionListener{
    private Label lblfah, lblcent;
    private TextField txtfah, txtcent;
    
    public myFrame(){
        setSize(300,100);// (width, height)
        setLocation(100,200);//(x-coordinate,y-coordinate)
        setTitle("Temperature Converter"); //the title of the window
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        txtfah.addActionListener(this);
  	txtcent.addActionListener(this);
        
        setVisible(true);//whether the frane is visible
    }
    private void intGUI(){                
        lblfah = new Label("Fahrenheit");
        txtfah = new TextField(20);
        add(lblfah);
        add(txtfah);

        
        lblcent = new Label("Centigrade");
        txtcent = new TextField(20);
        add(lblcent);
        add(txtcent);
        
        

    }
    public void actionPerformed (ActionEvent e)  {
        double fahr, cent;
        
        if (e.getSource() == txtfah){
            fahr =  Double.parseDouble(txtfah.getText());
            cent = 9.0 * fahr / 5.0 + 32.0;
            txtcent.setText(String.format("%.1f",cent));
        }
        else {
            cent = Double.parseDouble(txtfah.getText());
            fahr = 5.0 * (cent - 32.0) / 9.0;
            txtcent.setText(String.format("%.1f",fahr));
         }  
    }
}
