package Logical;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2095;
		if ((n%4==0)||(n%400==0&&n%100!=0))
		{
			System.out.println("N is a leap year");
		}
		else {
			System.out.println("N is not a leap year");
		}
	}

}
