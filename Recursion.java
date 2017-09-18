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
public class Recursion {

 public static void main (String[] args){
     
 char first ='A'; 
 char aux = 'B'; 
 char last = 'C'; 
 
 System.out.println("Enter a number");

 Scanner in = new Scanner(System.in);
  int n = in.nextInt(); 
  move(n,first,aux,last);

  System.out.println("sum is "+ sum(n)+"\n"+"fibbonachi is"+fibb(n));

 }
 //finds sum of n numbers
    private static int sum(int n) {
        if(n==0){
          return n; 
        }
        else{
          return n+sum(n-1);
        }
        
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
    //solves tower of hanoi 
    private static void move(int n, char first, char aux, char last) {
        
       if (n == 1) {
           System.out.println(first + " -> " + last);
       } else {
          move(n - 1, first, last, aux);
           System.out.println(first + " -> " + last);
           move(n - 1, aux, first,last);
       }
        
         }


}
