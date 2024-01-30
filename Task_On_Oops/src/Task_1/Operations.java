package Task_1;

import java.util.Scanner;

//Subclass cal inheriting from Calculator
public class Operations extends add_sub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the 1st number: ");
		int num1 = sc.nextInt();

		System.out.print("Enter the 2nd number: ");
		int num2 = sc.nextInt();

		add_sub op = new add_sub();   //because add and sub methods are inherited in this Cal

		// Perform addition and subtraction
		int sum = op.add(num1, num2);
		System.out.println("Sum: " + sum);
		int difference = op.subtract(num1, num2);
		System.out.println("Difference: " + difference);
	}
}
