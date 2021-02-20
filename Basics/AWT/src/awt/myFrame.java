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
public class myFrame extends JFrame{
    public myFrame(){
        setSize(300,300);// (width, height)
        setLocation(100,100);//(x-coordinate,y-coordinate)
        setTitle("My First GUI Program"); //the title of the window
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        
        setVisible(true);//whether the frane is visible
    }
    
    private void intGUI(){
        //Insert label into container
        Label lblUsername = new Label("Username");
        add(lblUsername); // add label into container
        
        //Add text field
        TextField txtUsername = new TextField(20); //TextField(size)
        add(txtUsername);// add text field into container
        
        //Add Text Area
        TextArea ta = new TextArea(5,20);//(height, width)
        add(ta);// add text area into container
        
        //Add Button
        Button btnLogin = new Button("Login");
        add(btnLogin); // add button into container
        
        //Add List
        List lst = new List(4, false);//(displayed item, true: select multiple item/false: select only 1 item)
        
        //Listed item
        lst.add("Mercury");
        lst.add("Venus");
        lst.add("Earth");
        lst.add("JavaSoft");
        lst.add("Mars");
        lst.add("Jupiter");
        lst.add("Saturn");
        lst.add("Uranus");
        lst.add("Neptune");
        lst.add("Pluto");
        add(lst); // add label into container
        
        //Add Choice/ Dropdown
        Choice c = new Choice();
        //choice item
        c.add("red");
        c.add("green");
        c.add("blue");
        add(c);// add label into container
        
        //Add Dialog(A container, hence no "add(...)")
        JDialog d = new JDialog(this, "java.awt.Dialog", true);//("this" to direct to the object, message,true: must close then only access the windows)
        d.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        d.setSize(200,100);
        d.setLocation(120,120);
        d.setVisible(false);
        
    }
}
