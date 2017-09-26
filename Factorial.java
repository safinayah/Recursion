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
public class Factorial {
    
    //prints factorial 
  public static int factorial(int n){  
      
      if(n==1||n==0)
          return 1;
      else 
          return (n*factorial(n-1));
  }  
  public static void main (String[] args){
     
   
     System.out.println("Enter a number");
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     

    
     System.out.println("factorial ="+  factorial(n));
     
 }
    
}
