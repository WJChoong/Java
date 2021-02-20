/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class LayoutForm extends JFrame{
    public LayoutForm(){
        setSize(300,300);// (width, height)
        setLocation(100,100);//(x-coordinate,y-coordinate)
        setTitle("My Layout Manager Program"); //the title of the window
        setLayout(new BorderLayout(5,5));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        
        setVisible(true);//whether the frane is visible
    }

    private void intGUI(){
        Button button1 = new Button("Yes");
        Button button2 = new Button("No");
        Button button3 = new Button("Cancel");
        Button button4 = new Button("Ignore");
        Button button5 = new Button("Retry");

        add(button1,"Center");
        add(button2,"South");
        add(button3,"East");
        add(button4,"West");
        add(button5,"North");
    }
}
