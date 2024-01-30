package Task_11;

import java.util.Scanner;

public class add_2_sub_3 {

//Overloading Concept-->>create methods in same class using same name but diff. input parameters
	public int add_2(int num1, int num2) {
		return num1 + num2;
	}

	public int sub_3(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		add_2_sub_3 as = new add_2_sub_3();

		System.out.println("Enter num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 :");
		int num2 = sc.nextInt();
		System.out.println("Enter num3 :");
		int num3 = sc.nextInt();

		int addition_result = as.add_2(num1, num2);
		System.out.println("Addition of two num :" + addition_result);
		int subtraction_result = as.sub_3(num1, num2, num3);
		System.out.println("Subtraction of three num :" + subtraction_result);
	}

}
