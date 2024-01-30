package Logical_1;

public class Palindrome_String {

	public static void main(String[] args) {

		String name = "name";
		String rev = "";
		String org_name = name;

		for (int i = name.length() - 1; i > 0; i--) {

			rev = rev + name.charAt(i);
		}
		if (org_name.equals(rev)) {
			System.out.println("Palindrome string");
		} else {
			System.out.println("Not palindrome string");
		}
	}

}
