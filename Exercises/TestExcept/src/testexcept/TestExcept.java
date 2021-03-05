/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexcept;

/**
 *
 * @author User
 */
public class TestExcept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Coffee Nescafe = new Coffee();
        Nescafe.setTemperature(95);
        
        Customer cus001 = new Customer();
        cus001.drinkCoffee(Nescafe);
        
        try{
            if (Nescafe.getTemperature() > 80)
                throw new TooHotException();
            else if(Nescafe.getTemperature() < 30)
                throw new TooColdException();
        }
        catch(TooHotException e){
            System.out.println(e.getMessage());
        }
        catch(TooColdException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Can I please have another cup");
        }
    }
    
}
