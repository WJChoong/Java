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
public class Calculator extends JFrame {
    public Calculator(){
        setSize(300,300);// (width, height)
        setLocation(100,200);//(x-coordinate,y-coordinate)
        setTitle("Calculator"); //the title of the window
        setLayout(new BorderLayout(0,0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        
        setVisible(true);//whether the frane is visible
    }
    private void intGUI(){        
        //Create panel
        Panel pOutput = new Panel();
        Panel pButton = new Panel();
        
        //Add panels
        add(pOutput, "North");
        add(pButton, "Center");
        
        //Apply Layout
        pOutput.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        pButton.setLayout(new GridLayout(0,4,0,0));
        
        TextField tf = new TextField(50);
        pOutput.add(tf);
        
        //Creating buttons for button panel
        Button btnSeven = new Button("7");
        Button btnEight = new Button("8");
        Button btnNine = new Button("9");
        Button btnDivide = new Button("/");
        Button btnFour = new Button("4");
        Button btnFive = new Button("5");
        Button btnSix = new Button("6");
        Button btnMultiply = new Button("*");
        Button btnOne = new Button("1");
        Button btnTwo = new Button("2");
        Button btnThree = new Button("3");
        Button btnMinus = new Button("-");
        Button btnZero = new Button("0");
        Button btnPoint = new Button(".");
        Button btnEqual = new Button("=");
        Button btnPlus = new Button("+");
        
        //adding Buttons into panel
        pButton.add(btnSeven);
        pButton.add(btnEight);
        pButton.add(btnNine);
        pButton.add(btnDivide);
        pButton.add(btnFour);
        pButton.add(btnFive);
        pButton.add(btnSix);
        pButton.add(btnMultiply);
        pButton.add(btnOne);
        pButton.add(btnTwo);
        pButton.add(btnThree);
        pButton.add(btnMinus);
        pButton.add(btnZero);
        pButton.add(btnPoint);
        pButton.add(btnEqual);
        pButton.add(btnPlus);    
    }
}
