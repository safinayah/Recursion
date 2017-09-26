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
public class StringRev {
  public static void main(String[] args){
    String str = "my name is    ";
  
    rev(str);
       
  }
  
  public static String rev(String str){
      int str1 = str.lastIndexOf(" ");
      if (str1 ==-1){
         System.out.print(str);
         return str;
      }
      
      else {
          System.out.print(str.substring(str1+1)+" ");
         return rev((str.substring(0,str1)));
      }
                  

        
  }
 
}
