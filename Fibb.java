/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Scanner;

/**
 *
 * @author ayah
 */
public class Fibb {
     public static void main (String[] args){   
       System.out.println("Enter a number");
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       System.out.println("fibbonachi is\n"+fibb(n));
     
     }
    
     //finds fibbonachi number 
     private static int fibb(int n) {
     if(n==1 || n == 2){
         return 1; 
         
     }
     else{
         return fibb(n-2)+fibb(n-1); 
         
     }
     
     
 }
    
}
