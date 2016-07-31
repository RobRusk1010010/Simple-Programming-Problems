/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementaryjava;

/**
 *
 * @author Robert
 */
import java.util.Scanner;

public class HelloScannedName {
    
    public static void main (String args[]){
        
        Scanner scan = new Scanner(System.in);
        String x;
        
        System.out.println("Enter your name: ");
        x = scan.nextLine();
        
        System.out.println("Hello " + x);
        
    }
    
}
