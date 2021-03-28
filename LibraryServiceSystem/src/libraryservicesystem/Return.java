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
public class Return extends JFrame implements ActionListener {   
    private JMenuBar mb;    
    private JMenu mAction;
    private JMenuItem btnrenew,btnloan,btnlogout, btncheck; 
    private Label lblTitle,lblStuID,lblBookID,lblMsg,lblFine;
    private TextField txtStuID, txtBookID;
    private Button btnProceed, btnClear,btnPaid,btnCancel;
    private String userID, bookID, msg,data,UserID,BookID,loanStatus, num;
    private LocalDate returnDate;
    
    public Return()throws IOException{      
        setTitle("Library Service System");
        setLocation(500,200);//(x,y)
        setLayout(new FlowLayout());   
        setSize(500,300);
        intGUI();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);     
        
        btnrenew.addActionListener(this);
        btnloan.addActionListener(this);
        btnlogout.addActionListener(this);
        btncheck.addActionListener(this);
        btnProceed.addActionListener(this);
        btnClear.addActionListener(this);
    }
    //the interface
    private void intGUI(){  
        //the menu bar
        mb=new JMenuBar();  
        mAction = new JMenu("Action");
        btnloan =new JMenuItem("Loan");  
        btnrenew=new JMenuItem("Renew");
        btncheck=new JMenuItem("Check");
        btnlogout=new JMenuItem("LogOut");  
        mb.add(mAction);
        mAction.add(btnloan);
        mAction.add(btnrenew);
        mAction.add(btncheck);
        mAction.add(btnlogout);
        add(mb);  
        setJMenuBar(mb);
        
        //the structure of the main body
        Panel pTitle = new Panel();
        Panel pStudentID = new Panel();
        Panel pBookID = new Panel();
        Panel pMsg = new Panel();
        Panel pButton = new Panel();
        
            //the set up of structure
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
        
        //the Title
        lblTitle = new Label("Return Book");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 30));
        pTitle.add(lblTitle);
        
        //The input for student/staff ID
        lblStuID = new Label("User ID: ");
        lblStuID.setFont(new Font("Verdana", Font.BOLD, 15));
        txtStuID = new TextField("", 20);
        pStudentID.add(lblStuID);
        pStudentID.add(txtStuID);
        
        //the input of book ID
        lblBookID = new Label("Book ID:");
        lblBookID.setFont(new Font("Verdana", Font.BOLD, 15));
        txtBookID = new TextField("", 20);
        pBookID.add(lblBookID);
        pBookID.add(txtBookID);
        
        //To display message
        lblMsg = new Label("                                                 ");
        lblMsg.setFont(new Font("Verdana", Font.BOLD, 15));
        pMsg.add(lblMsg);
        
        //The button located
        btnProceed = new Button("Proceed");
        btnProceed.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnProceed); 
        btnClear = new Button("btnClear");
        btnClear.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnClear); 
    }
    //if buttons are clicked
    public void actionPerformed (ActionEvent e)  {    
        if (e.getSource() == btnrenew){
            Renew renew = new Renew();
            this.dispose();
        }  
        else if (e.getSource() == btnloan){
            try {
                Loan login = new Loan();
            } catch (IOException ex) {
                Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        else if (e.getSource() == btnlogout){
            LoginPage login = new LoginPage();
            this.dispose();
        }
        else if (e.getSource() == btnProceed){
            //get input data
            userID = txtStuID.getText();
            bookID = txtBookID.getText();
            
            //call the ReturnBook class to proces the data
            if (userID.equals("") || bookID.equals("")){
                JOptionPane.showMessageDialog(null, "Please don't leave it blank");
            }
            else{
                try {
                    ReturnBook(userID, bookID);
                } catch (IOException ex) {
                    Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if (e.getSource() == btnClear){
            //clear all input data
            txtStuID.setText("");
            txtBookID.setText("");
            lblMsg.setText("");
        }
        else if(e.getSource() == btnPaid) {
            try {
                ReturnAction();
            } catch (IOException ex) {
                Logger.getLogger(Return.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (e.getSource() == btncheck){
            LateTable index = new LateTable();
            this.dispose();
        }
    }
    //process of returning the book
    public void ReturnBook(String uID, String bID) throws IOException{
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
        long noOfDaysBetween = ChronoUnit.DAYS.between(currentDate, returnDate);
        
        //check whether exceed the date pr not
        if (noOfDaysBetween < 0){
            int fine = (int)(noOfDaysBetween * -1);
            FineMsg(fine);
        }else if(noOfDaysBetween > 0){
            ReturnAction();
            lblMsg.setText("The book is returned.");
        }
    }
    
    //telling the fine
    private void FineMsg(int fine){
        JDialog d = new JDialog(this, "java.awt.Dialog", true);//("this" to direct to the object, message,true: must close then only access the windows)
        d.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);      
        d.setSize(400,200);
        d.setLocation(550,250);
        d.setTitle("Fine Message");
        d.setLayout(new FlowLayout());   
        
        Panel pMessage = new Panel();
        Panel pDialogButton = new Panel();
        pMessage.setPreferredSize(new Dimension(400, 80));
        pDialogButton.setPreferredSize(new Dimension(400, 80));
        d.add(pMessage);
        d.add(pDialogButton);
        
        lblFine = new Label("Your fine is RM" + fine);
        lblFine.setFont(new Font("Verdana", Font.BOLD, 20));
        pMessage.add(lblFine);
        
        btnPaid = new Button("Paid");
        btnPaid.setFont(new Font("Verdana", Font.PLAIN, 15));
        pDialogButton.add(btnPaid); 
        btnCancel = new Button("Cancel");
        btnCancel.setFont(new Font("Verdana", Font.PLAIN, 15));
        pDialogButton.add(btnCancel);
        
        btnPaid.addActionListener(this);
        btnCancel.addActionListener(this);
        
        d.setVisible(true);
    }    
    
    //the action returning the book
    public void ReturnAction()throws IOException{
        userID = txtStuID.getText();
        bookID = txtBookID.getText();
        ChangeData cd = new ChangeData(userID, bookID);
    }
}
