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
public class OccurencesNum {
  
    
    public static void main(String [] args){
          String s= "aaa"; 
          countA(s); 
          System.out.print(countA(s) +"\n" );
    }

    private static int countA(String s) {
        int i=0; 
        char ch= s.charAt(i); 
       // System.out.println(s.length());
        if((ch=='a' || ch=='A')&&s.length()==1)
            return 1;
        if((ch=='a' || ch=='A')&&s.length()>1)
           return 1+ countA(s.substring(1));
        else if(s.length()>1)
            return 0+ countA(s.substring(1));
        return 0;
   
    }
    
   

    
}
