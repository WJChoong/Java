/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryservicesystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class Renew extends JFrame implements ActionListener {   
    private JMenuBar mb;  
    private JMenu mAction;
    private JMenuItem btnreturns,btnloan, btnlogout; 
    private Label lblTitle,lblStuID,lblBookID;
    private TextField txtStuID, txtBookID;
    private Button btnProceed, btnClear;
    private String userID, bookID, msg,data,UserID,BookID,loanStatus, num;
    private LocalDate returnDate,newdate;
          
    public Renew(){      
        setTitle("Library Service System");
        setLocation(500,200);//(x,y)
        setLayout(new FlowLayout());   
        setSize(500,300);
        intGUI();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);     
        
        btnreturns.addActionListener(this);
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
        btnreturns=new JMenuItem("Return"); 
        btnlogout=new JMenuItem("LogOut");  
        mb.add(mAction);
        mAction.add(btnloan);
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
        
        lblStuID = new Label("User ID: ");
        lblStuID.setFont(new Font("Verdana", Font.BOLD, 15));
        txtStuID = new TextField("", 20);
        pStudentID.add(lblStuID);
        pStudentID.add(txtStuID);
        
        lblBookID = new Label("Book ID: ");
        lblBookID.setFont(new Font("Verdana", Font.BOLD, 15));
        txtBookID = new TextField("", 20);
        pBookID.add(lblBookID);
        pBookID.add(txtBookID);
        
        btnProceed = new Button("Proceed");
        btnProceed.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnProceed); 
        btnClear = new Button("Clear");
        btnClear.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnClear); 
    }
     public void actionPerformed (ActionEvent e)  {        
        if (e.getSource() == btnreturns){
            try {
                Return returnbook = new Return();
            } catch (IOException ex) {
                Logger.getLogger(Renew.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
        else if (e.getSource() == btnloan){
            try {
                Loan borrows = new Loan();
            } catch (IOException ex) {
                Logger.getLogger(Renew.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (e.getSource() == btnlogout){
            LoginPage login = new LoginPage();
        }
        else if (e.getSource() == btnProceed){
           userID = txtStuID.getText();
           bookID = txtBookID.getText();
            try {
                RenewBook(userID, bookID);
            } catch (IOException ex) {
                Logger.getLogger(Renew.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (e.getSource() == btnClear){
            txtStuID.setText("");
            txtBookID.setText("");
        }
    }
    public void RenewBook(String uID, String bID) throws IOException{
        //get current date
        LocalDate currentDate = LocalDate.now();
        
        //Locate the database
        String filename = "Loan.txt";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        
        // Read lines from the file until no more are left.
        while (inputFile.hasNext())
        {
           // Read the next line.
            data = inputFile.nextLine();

            // Split the line by using the delimiter ":" (semicolon) and store into array.
            String[] details = data.split(":");
            
            //store the data read
            UserID = details[1];
            BookID = details[2];
            loanStatus = details[5];
            
            //get the correct record
            if ((uID.equals(UserID) )&& (bID.equals(BookID)) && (loanStatus.equals("Loaned"))){
                num = details[0];
                returnDate = LocalDate.parse(details[4]);
            }
        }
        inputFile.close(); // Close the file   
        newdate = currentDate.plus(2, ChronoUnit.WEEKS);
        long noOfDaysBetween = ChronoUnit.DAYS.between(currentDate, returnDate);
        
        //check whether exceed the date pr not
        if (noOfDaysBetween < 0){
            println("Sohai");
        }else if(noOfDaysBetween > 0){
            new ChangeData(uID, bID, newdate);
        }
        
    }
}
