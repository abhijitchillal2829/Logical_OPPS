package LogicalProgramme;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String S = "Abhijit";
		String reverse = "";
		
		for(int i=S.length()-1;i>=0;i--) {
			
			 reverse = reverse + S.charAt(i);
		}if(S.equals(reverse)) {
			System.out.println("Palindrome string");
		}else {
			System.out.println("Not palindrome string");
		}
		
		String S1 = "madam";
		String rev = "";
		
		for(int j=S1.length()-1;j>=0;j--) {
			
			rev = rev + S1.charAt(j);
		}if(S1.equals(rev)) {
			System.out.println("Palindrome string");
		}else {
			System.out.println("Not palindrome string");
		}
	}
	
	

}
