/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memosaver;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class MemoSaver extends JFrame implements ActionListener{
    private Panel textPanel, buttonPanel;
    private TextArea theText;
    private Button memo1Button, memo2Button, clearButton, getMemo1Button, getMemo2Button;

    private String memo1 = "No Memo 1";
    private String memo2 = "No Memo 2";
    
    public MemoSaver(){
        setTitle("Memo Saver");
        setLayout(new BorderLayout());
        setSize(450,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    //Panel
        //textPanel
        textPanel = new Panel();
        textPanel.setBackground(Color.white);
        theText = new TextArea(10,40);
        theText.setBackground(Color.white);
        textPanel.add(theText);

        add(textPanel, "Center");
    
        //buttonPanel
        buttonPanel = new Panel();
        buttonPanel.setBackground(Color.blue);
        buttonPanel.setLayout(new FlowLayout());
        add(buttonPanel,"South");
        
    //Buttons
        
        //Save
        memo1Button = new Button("Save Memo 1");
        memo1Button.addActionListener(this);
        buttonPanel.add(memo1Button);
        memo2Button = new Button("Save Memo 2");
        memo2Button.addActionListener(this);
        buttonPanel.add(memo2Button);
        
        //Clear
        clearButton = new Button("Clear");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);
        
        //get Memo
        getMemo1Button = new Button("Get Memo 1");
        getMemo1Button.addActionListener(this);
        buttonPanel.add(getMemo1Button);
        getMemo2Button = new Button("Get Memo 2");
        getMemo2Button.addActionListener(this);
        buttonPanel.add(getMemo2Button);

        setVisible(true);
    }   
    public void actionPerformed (ActionEvent e)  {
        if (e.getSource()==memo1Button)
            memo1=theText.getText();
        else if (e.getSource()==memo2Button)
            memo2=theText.getText();
        else if (e.getSource()==clearButton)
            theText.setText(" ");
        else if (e.getSource()==getMemo1Button)
            theText.setText(memo1);
        else if (e.getSource()==getMemo2Button)
            theText.setText(memo2);
    }

    public static void main (String[] args)  {
        MemoSaver guiDemo = new MemoSaver();
    }

}
