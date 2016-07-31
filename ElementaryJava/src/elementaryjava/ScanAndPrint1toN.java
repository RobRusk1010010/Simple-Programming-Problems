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

public class ScanAndPrint1toN {
    
    public static void main (String args[]){
        
        Scanner scan = new Scanner(System.in);
        int x, total = 0;
        System.out.println("Enter an integer: ");
        x = scan.nextInt();
        
        for(int i = 1; i <= x; i++){
            total = total + i;
        }
        
        System.out.println("The total is: " + total);
        
    }
    
}
