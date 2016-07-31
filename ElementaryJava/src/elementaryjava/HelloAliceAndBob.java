/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementaryjava;

import java.util.Scanner;

/**
 *
 * @author Robert
 */
public class HelloAliceAndBob {
    
    public static void main (String args[]){
        
        Scanner scan = new Scanner(System.in);
        String x;
        
        System.out.println("Enter your name: ");
        x = scan.nextLine();
        
        switch (x) {
            case "Alice":
                System.out.println("Hello " + x);
                break;
            case "Bob":
                System.out.println("Hello " + x);
                break;
            default:
                System.out.println("I'm afraid I dont know you");
                break;
        }
        
        
    }
    
}
