/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;



/**
 *
 * @author ayah
 */
public class IsPalindrome {
     public static void main (String[] args){
  
     String word = "aaaaa";
     

     if (isPalindrome(word)==true)
         System.out.println("palindrome");
     else
         System.out.println("not palindrome");
   
     
 }
 //finds sum of n numbers



 
 
 
 
  
  //prints palindrome 
  public static boolean isPalindrome(String word){
      
      if(word.length()==0||word.length()==1){
       return true; 
      }
      else if(word.charAt(0)==word.charAt(word.length()-1)){
          
          return isPalindrome(word.substring(1, word.length()-1)); 
          
      }
      else
          
       return false; 
  }
  
}
