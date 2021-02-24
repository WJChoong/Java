/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awtcounter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class myForm extends JFrame implements ActionListener {
   private Label lblCount;
   private TextField tfCount;
   private Button btnCount;
   private int count = 0;
   
    
   public myForm () {
      setLayout(new FlowLayout());
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      lblCount = new Label("Counter");
      add(lblCount);
 
      tfCount = new TextField(count + "", 10); 
      tfCount.setEditable(false);
      add(tfCount);
      btnCount = new Button("Count");
      add(btnCount);
      btnCount.addActionListener(this);
 
      setSize(250, 100);
      setTitle("AWT Counter");
      setVisible(true);
   }
 
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count;
      tfCount.setText(count + "");
   } 
}
