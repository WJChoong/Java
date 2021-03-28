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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class LateTable extends JFrame implements ActionListener{
    private JMenuBar mb;  
    private JMenu mAction;
    private JMenuItem btnreturns,btnloan,btnrenew, btnlogout; 
    private Label lblTitle;
    private Button btnDone;
    JTable table; 
    String data, filename, no, uID, bID, bdate, rdate;
    
    public LateTable(){ 
        setSize(500,300);
        setLocation(500,200);//(x,y)
        setTitle("Library Service System");
        setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GUI();
        
        setVisible(true);
        
        btnreturns.addActionListener(this);
        btnrenew.addActionListener(this);
        btnlogout.addActionListener(this);
        btnDone.addActionListener(this);
    }
    public void GUI(){
        mb=new JMenuBar();  
        mAction = new JMenu("Action");
        btnrenew=new JMenuItem("Renew");
        btnloan =new JMenuItem("Loan");  
        btnreturns=new JMenuItem("Return"); 
        btnlogout=new JMenuItem("LogOut");  
        mb.add(mAction);
        mAction.add(btnrenew);
        mAction.add(btnloan);
        mAction.add(btnreturns);
        mAction.add(btnlogout);
        add(mb);  
        setJMenuBar(mb);
        
        Panel pTitle = new Panel();;
        Panel pButton = new Panel();
        
        pTitle.setPreferredSize(new Dimension(500, 50));
        pButton.setPreferredSize(new Dimension(500, 50));
        add(pTitle);
        try {
            table();
        } catch (IOException ex) {
            Logger.getLogger(LateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        add(pButton);
        
        lblTitle = new Label("Books not returned");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 20));
        pTitle.add(lblTitle);
        
        btnDone = new Button("Done");
        btnDone.setFont(new Font("Verdana", Font.PLAIN, 15));
        pButton.add(btnDone); 
    }
    public void table() throws IOException{
        String [] colmnNames = {"No.", "User ID", "Book ID", "Borrow Date", "Return Date"};
        
        //Locate the database
        filename = "Loan.txt";
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        Object[][] namelist=new Object[100][5];
        Integer num = 0;
        
//         Read lines from the file until no more are left.
        while (inputFile.hasNext())
        {
           // Read the next line.
            data = inputFile.nextLine();

            // Split the line by using the delimiter ":" (semicolon) and store into array.
            String[] details = data.split(":");
            
            no = String.valueOf(num+1);
            uID = details[1];
            bID = details[2];
            bdate = details[3];
            rdate = details[4];
            
            if (details[5].equals("Loaned")){
                namelist[num][0] = no;
                namelist[num][1] = uID;
                namelist[num][2] = bID;
                namelist[num][3] = bdate;
                namelist[num][4] = rdate;
                num ++;
            }
        };
        table = new JTable(namelist, colmnNames);
        table.setPreferredScrollableViewportSize(new Dimension(400, 100));
        table.setFillsViewportHeight(true);
        
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }
    public void actionPerformed (ActionEvent e) {        
        if (e.getSource() == btnreturns){
            try {
                Return returnbook = new Return();
            } catch (IOException ex) {
                Logger.getLogger(Renew.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
        else if (e.getSource() == btnrenew){
            Renew borrows = new Renew();
            this.dispose();
        } 
        else if (e.getSource() == btnloan){
            try {
                Loan borrows = new Loan();
                this.dispose();
            } catch (IOException ex) {
                Logger.getLogger(Renew.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (e.getSource() == btnlogout){
            LoginPage login = new LoginPage();
            this.dispose();
        }
        else if (e.getSource() == btnDone){
            ActionPage index = new ActionPage();
            this.dispose();
        }
    }
}
