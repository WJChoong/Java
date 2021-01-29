/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class LinearSearch {
    static int search(int arr[], int n, int x) 
       { 
           for (int i = 0; i < n; i++) { 
               // Return the index of the element if the element 
               // is found 
               if (arr[i] == x) 
                   return i; 
           } 

           // return -1 if the element is not found 
           return -1; 
       } 
  
    /**
     * @param args the command line arguments
     * @return 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        
        Scanner inp = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++){
            System.out.print("Please enter a number: ");  
            int num = inp.nextInt();
            array[i] = num;
        }
        System.out.print("Please enter a number to search ");
        int num = inp.nextInt();
        int n = array.length;
        int index = search(array, n, num);
        if (index == -1){
            System.out.println("Element is not present in the array.");      
        }
        else{
            System.out.println("The element is in index " + index);
        }
    }
    
}
