package Logical_Programme_Pune;

public class Palindrome_String {

	public static void main(String[] args) {
		
		String name = "Abhijit";
		
		String rev_name = "";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			rev_name = rev_name + name.charAt(i);
		}
		if(rev_name.equals(name)) {
			System.out.println("Palindrome string is :" + rev_name);
		}else {
			System.out.println(rev_name + ": Not a palindrome string");
		}
		
		System.out.println();
		
		String name1 = "madam";
		
		String rev_name1 = "";
		
		for(int j=name1.length()-1;j>=0;j--) {
			
			rev_name1 = rev_name1 + name1.charAt(j);
		}if(rev_name1.equals(name1)) {
			System.out.println(rev_name1 + " : Palindrome string");
		}else {
			System.out.println(rev_name1 + " : Not a palindrome string");
		}

	}
}
