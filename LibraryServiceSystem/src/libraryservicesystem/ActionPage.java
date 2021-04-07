/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryservicesystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class ActionPage extends JFrame implements ActionListener{
    private Label lblTitle;
    private Button btnLoan,btnRenew, btnReturn, btnCheck;
    
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
        btnCheck.addActionListener(this);
        
        //set whether the frane is visible
        setVisible(true);
    }
    
    //the code for GUI
    private void intGUI(){
        Panel pTitle = new Panel();
        Panel pLoan = new Panel();
        Panel pRenew = new Panel();
        Panel pReturn = new Panel();
        Panel pCheck = new Panel();
        
        pTitle.setPreferredSize(new Dimension(500, 50));
        pLoan.setPreferredSize(new Dimension(500, 50));
        pRenew.setPreferredSize(new Dimension(500, 50));
        pReturn.setPreferredSize(new Dimension(500, 50));
        pCheck.setPreferredSize(new Dimension(500, 50));
        add(pTitle);
        add(pLoan);
        add(pRenew);
        add(pReturn);
        add(pCheck);
        
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
        
        btnCheck = new Button("Check Loaned List");
        btnCheck.setFont(new Font("Verdana", Font.PLAIN, 15));
        pCheck.add(btnCheck);
    }
    public void actionPerformed (ActionEvent e)  {        
        if (e.getSource() == btnLoan){
            try {
                Loan loan = new Loan();
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(ActionPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (e.getSource() == btnRenew){
            Renew renew = new Renew();
            this.dispose();
        }  
        else if (e.getSource() == btnReturn){
            try {
                Return returns = new Return();
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(ActionPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        else if (e.getSource() == btnCheck){
            LateTable renew = new LateTable();
            this.dispose();
        } 
    }
    
}
