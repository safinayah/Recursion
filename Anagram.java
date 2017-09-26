package datastructures;
public class Anagram {

	     public static void main(String[] args)  {

	        Anagrams("", "abc");

	    }

    private static void Anagrams(String prefix, String word) {
        
        if (word.length() <= 1){
            System.out.println(prefix + word);
        }
        else{
            
            for(int i=0; i<word.length();i++){
                
                char cur =word.charAt(i); 
                String befor = word.substring(0, i); 
                String after = word.substring(i+1); 
                Anagrams(prefix + cur ,befor +after);
            
            }
        
        }
        
         }
}
