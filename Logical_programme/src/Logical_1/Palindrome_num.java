package Logical_1;

public class Palindrome_num {

	public static void main(String[] args) {

		int num = 123456;
		int rev = 0;
		int org_num = num;

		while (num != 0) {

			rev = rev / 10 + num % 10;
			num = num / 10;
		}
		if (org_num == rev) {
			System.out.println("Palindrome num");
		} else {
			System.out.println("Not palindrome num");
		}
	}
}
