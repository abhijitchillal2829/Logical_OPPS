package Task_12;

import java.util.Scanner;

// Concrete subclass implementing the Calculator
class Concreate_class extends add_sub_mul {
 
	@Override
	public int add(int num1, int num2) {
		   return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		   return num1 - num2;
	}

	@Override
	public int multiply(int num1, int num2) {
		   return num1 * num2;
	}
}

public class abstraction_concept {
    public static void main(String[] args) {	
    	Scanner sc = new Scanner(System.in);
       
    	// Create an instance of Concreate_class
    	Concreate_class cc = new Concreate_class();

        System.out.println("Enter num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 :");
        int num2 = sc.nextInt();

        int additionResult = cc.add(num1, num2);
        System.out.println("Addition: " + additionResult);
        int subtractionResult = cc.subtract(num1, num2);
        System.out.println("Subtraction: " + subtractionResult);
        int multiplicationResult = cc.multiply(num1, num2);
        System.out.println("Multiplication: " + multiplicationResult);
    }
}