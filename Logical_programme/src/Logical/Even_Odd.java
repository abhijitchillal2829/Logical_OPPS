package Logical;

public class Even_Odd {

	public static void main(String[] args) {
	      String original = "Abhijit";
	      String reverse = ""; 
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if(reverse.equals(original)) {
	    	  System.out.println("Palindrome string");
	      }else {
	    	  System.out.println("Not palindrome string");
	      }

}
}
