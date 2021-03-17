/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentdatetime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
/**
 *
 * @author User
 */
public class CurrentDateTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd ");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now)); 
        
        //Getting the current Date value
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: "+currentDate);
        //Adding two week to the current date
        LocalDate result = currentDate.plus(2, ChronoUnit.WEEKS);
        System.out.println("Day after two week: "+result);
		
	//Parsing the date
	LocalDate dateBefore = currentDate;
	LocalDate dateAfter = result;
		
	//calculating number of days in between
	long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
		
	//displaying the number of days
	System.out.println(noOfDaysBetween);
        int fine = (int) (noOfDaysBetween * 1) ;
        System.out.println("RM" + fine);
        String[] hey;
        hey = new String[6];
        hey[0] = "over";
        hey[1] = "bye bye";
        System.out.println(Arrays.toString(hey);
    }
    
}
