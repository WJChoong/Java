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
public class Customer {
    public void drinkCoffee(Coffee cup)
	{
            int temperature = cup.getTemperature();
            System.out.println("Coffee temperature is " + temperature);
	}  
}
