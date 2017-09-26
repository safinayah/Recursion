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
public class TowerOfHanoi {
    public static void main (String[] args){
     
     char first ='A'; 
     char aux = 'B'; 
     char last = 'C'; 
     System.out.println("Enter a number");
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     move(n,first,aux,last);
    }
    
     //solves tower of hanoi 
 private static void move(int n, char first, char aux, char last) {
     System.out.println("Tower of hanoi sloution is ");
     if (n == 1) {
         System.out.println(first + " -> " + last);
     } else {
         move(n - 1, first, last, aux);
         System.out.println(first + " -> " + last);
         move(n - 1, aux, first,last);
     }
     
 }
    
}
