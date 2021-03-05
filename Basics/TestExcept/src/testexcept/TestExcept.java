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
    public static void main(String[] args) {
        // TODO code application logic here
        try{
//            int a, b, result;
//            a = 1;
//            b = 0;
//            result = a/b;
//
//            System.out.println(result);
            methodA();            
        }
        catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bounds");
        }
        catch(Exception e){
            System.out.println("Run time error code");
        }
    }
    
    public static void methodA() throws ArithmeticException{
        throw new ArithmeticException("testing");
    }
    
}
