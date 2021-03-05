/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryservicesystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author User
 */
public class ActionPage extends JFrame implements ActionListener{
    private Label lblTitle;
    private Button btnLoan,btnRenew, btnReturn;
    
    public ActionPage(){    
        setSize(500,300);
        setLocation(500,200);//(x,y)
        setTitle("Library Service System");
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        
        intGUI();
        btnLoan.addActionListener(this);
        btnRenew.addActionListener(this);
        btnReturn.addActionListener(this);
        
        //set whether the frane is visible
        setVisible(true);
    }
    
    //the code for GUI
    private void intGUI(){
        Panel pTitle = new Panel();
        Panel pLoan = new Panel();
        Panel pRenew = new Panel();
        Panel pReturn = new Panel();
        
        pTitle.setPreferredSize(new Dimension(500, 50));
        pLoan.setPreferredSize(new Dimension(500, 50));
        pRenew.setPreferredSize(new Dimension(500, 50));
        pReturn.setPreferredSize(new Dimension(500, 50));
        add(pTitle);
        add(pLoan);
        add(pRenew);
        add(pReturn);
        
        lblTitle = new Label("How Can I Help You ?");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 30));
        pTitle.add(lblTitle);
        
        btnLoan = new Button("Loan Book");
        btnLoan.setFont(new Font("Verdana", Font.PLAIN, 15));
        pLoan.add(btnLoan); 
        
        btnRenew = new Button("Renew Book");
        btnRenew.setFont(new Font("Verdana", Font.PLAIN, 15));
        pRenew.add(btnRenew); 
        
        btnReturn = new Button("Return Book");
        btnReturn.setFont(new Font("Verdana", Font.PLAIN, 15));
        pReturn.add(btnReturn); 
    }
    public void actionPerformed (ActionEvent e)  {        
        if (e.getSource() == btnLoan){
            Loan loan = new Loan();
        }
        else if (e.getSource() == btnRenew){
            Renew renew = new Renew();
        }  
        else if (e.getSource() == btnReturn){
            Return returns = new Return();
        } 
    }
    
}
