package Logical_Programme_Pune;

public class Reverse_Num {

	public static void main(String[] args) {
		
		int num = 123456;
		int rev_num = 0;
		
		for(int i=0;i<num;i++) {
			
			rev_num = rev_num + num/10;
			
			num = num%10;
		}System.out.println("Reverse num is :" + rev_num);
	}
}
