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
public class DecendingOreder {
    //prints number in descending order
 private static void number(int n){
     
     if(n==0)
         System.out.println(0);
     else{
         System.out.println(n);
         number(n-1);
     }
 }
     public static void main (String[] args){
     
   

     
     System.out.println("Enter a number");
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
    
     number(n);

  
     
 }
    

}