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
public class MemoSaver extends JFrame{
    public MemoSaver(){
        setSize(300,300);// (width, height)
        setLocation(100,200);//(x-coordinate,y-coordinate)
        setTitle("Memo Saver"); //the title of the window
        setLayout(new BorderLayout(0,0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        
        setVisible(true);//whether the frane is visible
    }
    private void intGUI(){
        //Create background
        Panel pTextArea = new Panel();
        Panel pButton = new Panel();
        
        //set background color
        pTextArea.setBackground(Color.yellow);
        pButton.setBackground(Color.green);
        
        //Set different Layout for panels
        pTextArea.setLayout(new FlowLayout());
        pButton.setLayout(new GridLayout(1,0,0,0));
        
        //Allocate location of panels
        add(pTextArea, "Center");
        add(pButton, "South");
        
        //Adding TextArea into textarea panel
        TextArea ta = new TextArea(20,20);
        pTextArea.add(ta);
        
        //Creating buttons for button panel
        Button btnSaveMemo1 = new Button("Save Memo 1");
        Button btnSaveMemo2 = new Button("Save Memo 2");
        Button btnClear = new Button("Clear");
        Button btnGetMemo1 = new Button("Get Memo 1");
        Button btnGetMemo2 = new Button("Get Memo 2");
        
        //adding Buttons into panel
        pButton.add(btnSaveMemo1);
        pButton.add(btnSaveMemo2);
        pButton.add(btnClear);
        pButton.add(btnGetMemo1);
        pButton.add(btnGetMemo2);
    }
}
