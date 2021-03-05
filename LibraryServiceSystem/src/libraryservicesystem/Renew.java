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
public class Renew extends JFrame implements ActionListener {   
    private JMenuBar mb;  
    private JMenu mAction;
    private JMenuItem btnreturns, btnrenew,btnloan, btnlogout; 
    private Label lblTitle,lblStuID,lblBookID;
    private TextField txtStuID, txtBookID;
    private Button btnProceed, btnClear;
          
    public Renew(){      
        setTitle("Library Service System");
        setLocation(500,200);//(x,y)
        setLayout(new FlowLayout());   
        setSize(500,300);
        intGUI();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);     
        
        btnreturns.addActionListener(this);
        btnrenew.addActionListener(this);
        btnloan.addActionListener(this);
        btnlogout.addActionListener(this);
        btnProceed.addActionListener(this);
        btnClear.addActionListener(this);
        btnProceed.addActionListener(this);
        btnClear.addActionListener(this);
    }
    
    private void intGUI(){               
        mb=new JMenuBar();  
        mAction = new JMenu("Action");
        btnloan =new JMenuItem("Loan");  
        btnrenew=new JMenuItem("Renew");
        btnreturns=new JMenuItem("Return"); 
        btnlogout=new JMenuItem("LogOut");  
        mb.add(mAction);
        mAction.add(btnloan);
        mAction.add(btnrenew); 
        mAction.add(btnreturns);
        mAction.add(btnlogout);
        add(mb);  
        setJMenuBar(mb);
        
        Panel pTitle = new Panel();
        Panel pStudentID = new Panel();
        Panel pBookID = new Panel();
        Panel pButton = new Panel();
        
        pTitle.setPreferredSize(new Dimension(500, 50));
        pStudentID.setPreferredSize(new Dimension(500, 50));
        pBookID.setPreferredSize(new Dimension(500, 50));
        pButton.setPreferredSize(new Dimension(500, 50));
        add(pTitle);
        add(pStudentID);
        add(pBookID);
        add(pButton);
        
        lblTitle = new Label("Renew Book");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 30));
        pTitle.add(lblTitle);
        
        lblStuID = new Label("Student ID: ");
        lblStuID.setFont(new Font("Verdana", Font.BOLD, 15));
        txtStuID = new TextField("", 20);
        pStudentID.add(lblStuID);
        pStudentID.add(txtStuID);
        
        lblBookID = new Label("Book ID: ");
        lblBookID.setFont(new Font("Verdana", Font.BOLD, 15));
        txtBookID = new TextField("", 20);
        pBookID.add(lblBookID);
        pBookID.add(txtBookID);
        
        Button btnProceed = new Button("Proceed");
        btnProceed.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnProceed); 
        Button btnClear = new Button("btnClear");
        btnProceed.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnClear); 
    }
     public void actionPerformed (ActionEvent e)  {        
        if (e.getSource() == btnreturns){
            Return returnbook = new Return();
        } 
        else if (e.getSource() == btnrenew){
            Renew borrows = new Renew();
        }  
        else if (e.getSource() == btnloan){
            Loan borrows = new Loan();
        }
        else if (e.getSource() == btnloan){
            LoginPage login = new LoginPage();
        }
        else if (e.getSource() == btnProceed){
           
        }
        else if (e.getSource() == btnClear){
            txtStuID.setText("");
            txtBookID.setText("");
        }
    }
}
