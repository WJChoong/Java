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
public abstract class TemperatureException  extends Exception{ //abstract class: clas cannot be instantiated
    TemperatureException(String msg){
        super(msg);
    }
}
class TooColdException extends TemperatureException{
    public TooColdException(){
        super("It's too cold");
    }
}
class TooHotException extends TemperatureException{
    public TooHotException(){
        super("It's too hot");
    }
}