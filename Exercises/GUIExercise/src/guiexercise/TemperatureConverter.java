package guiexercise;
import java.awt.*;
import javax.swing.*;


public class TemperatureConverter extends JFrame{
    public TemperatureConverter(){
        setSize(300,100);// (width, height)
        setLocation(100,200);//(x-coordinate,y-coordinate)
        setTitle("Temperature Converter"); //the title of the window
        setLayout(new BorderLayout(0,0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        intGUI();
        
        setVisible(true);//whether the frane is visible
    }
    private void intGUI(){                
        //Adding TextArea into textarea panel
        Label  title= new Label("Enter Farenheit temperature: ");
        title.setBackground(Color.LIGHT_GRAY);
        add(title, "North");
        
        //Creating buttons for button panel
        TextField input = new TextField(300);
        input.setBackground(Color.WHITE);
        add(input, "Center");
        
        //adding Buttons into panel
        Label  answer = new Label("Temperature in Celcius is 23");
        answer.setBackground(Color.LIGHT_GRAY);
        add(answer, "South");
    }
}

