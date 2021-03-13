/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryservicesystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Loan extends JFrame implements ActionListener {   
    private JMenuBar mb;    
    private JMenu mAction;
    private JMenuItem btnreturns, btnrenew, btnlogout; 
    private Label lblTitle,lblStuID,lblBookID,lblMsg;
    private TextField txtStuID, txtBookID;
    private Button btnProceed, btnClear;
    private String userID, bookID, msg;
          
    public Loan() throws IOException{      
        setTitle("Library Service System");
        setLocation(500,200);//(x,y)
        setLayout(new FlowLayout());   
        setSize(500,300);
        intGUI();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);     
        
        btnreturns.addActionListener(this);
        btnrenew.addActionListener(this);
        btnlogout.addActionListener(this);
        btnProceed.addActionListener(this);
        btnClear.addActionListener(this);
    }
    
    private void intGUI(){               
        mb=new JMenuBar();  
        mAction = new JMenu("Action"); 
        btnrenew=new JMenuItem("Renew");
        btnreturns=new JMenuItem("Return"); 
        btnlogout=new JMenuItem("LogOut");  
        mb.add(mAction);
        mAction.add(btnrenew); 
        mAction.add(btnreturns);
        mAction.add(btnlogout);
        add(mb);  
        setJMenuBar(mb);
        
        Panel pTitle = new Panel();
        Panel pStudentID = new Panel();
        Panel pBookID = new Panel();
        Panel pMsg = new Panel();
        Panel pButton = new Panel();
        
        pTitle.setPreferredSize(new Dimension(500, 50));
        pStudentID.setPreferredSize(new Dimension(500, 30));
        pBookID.setPreferredSize(new Dimension(500, 30));
        pMsg.setPreferredSize(new Dimension(500, 30));
        pButton.setPreferredSize(new Dimension(500, 30));
        add(pTitle);
        add(pStudentID);
        add(pBookID);
        add(pMsg);
        add(pButton);
        
        lblTitle = new Label("Loan Book");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 30));
        pTitle.add(lblTitle);
        
        lblStuID = new Label("User ID: ");
        lblStuID.setFont(new Font("Verdana", Font.BOLD, 15));
        txtStuID = new TextField("", 20);
        pStudentID.add(lblStuID);
        pStudentID.add(txtStuID);
        
        lblBookID = new Label("Book ID:");
        lblBookID.setFont(new Font("Verdana", Font.BOLD, 15));
        txtBookID = new TextField("", 20);
        pBookID.add(lblBookID);
        pBookID.add(txtBookID);
        
        lblMsg = new Label("                                                 ");
        lblMsg.setFont(new Font("Verdana", Font.BOLD, 15));
        pMsg.add(lblMsg);
        
        btnProceed = new Button("Proceed");
        btnProceed.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnProceed); 
        btnClear = new Button("Clear");
        btnClear.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnClear);  
    }
    
    @Override
    public void actionPerformed (ActionEvent e) {        
        if (e.getSource() == btnreturns){
            Return returnbook = new Return();
        } 
        else if (e.getSource() == btnrenew){
            Renew borrows = new Renew();
        }  
        else if (e.getSource() == btnlogout){
            LoginPage login = new LoginPage();
        }
        else if (e.getSource() == btnProceed) {
            userID = txtStuID.getText();
            bookID = txtBookID.getText(); 
            try {
                LoanAction(userID, bookID);
            } catch (IOException ex) {
                Logger.getLogger(Loan.class.getName()).log(Level.SEVERE, null, ex);
            }
            lblMsg.setText(msg);
            txtStuID.setText("");
            txtBookID.setText("");
        }
        else if (e.getSource() == btnClear){
            txtStuID.setText("");
            txtBookID.setText("");
        }
    } 
    public void LoanAction(String uID, String bID) throws IOException{
        LocalDate currentDate = LocalDate.now();
        LocalDate result = currentDate.plus(2, ChronoUnit.WEEKS);
        
        String filename = "Loan.txt";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        // Read lines from the file until no more are left.
        Integer num = 0;
        while (inputFile.hasNext())
        {
           // Read the next line.
           String data = inputFile.nextLine();

           // Split the line by using the delimiter ":" (semicolon) and store into array.
           String[] details = data.split(":");
           int ID = Integer.parseInt(details[0]);
           if (ID > num){
               num = ID;
           }
           String name = details[1];
        }
        inputFile.close(); // Close the file
        
        FileWriter fw = new FileWriter(filename, true);
        PrintWriter outputFile = new PrintWriter(fw);
        
        String data = (num + 1) + ":" + uID + ":" + bID + ":" + currentDate + ":" + result +":Loaned";
        outputFile.println(data);
        outputFile.close();
        msg = "Loan Book Successfully";
    }
}
