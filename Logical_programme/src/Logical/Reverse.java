package Logical;

public class Reverse {
	public static void main(String[] args) {
		
	
	long rev = 0; 
	int rem;
	long number = 1978;
	
	while(number!= 0) {         // 197
	long remainder = number% 10;    //7   9
	rev = rev *10 + remainder;      //87  879
	 number = number/ 10;       //19      1   0
	}
	System.out.print(rev);
	
	System.out.println();
	
	int num = 1234567;
	
	int rev_num = 0;
	
	while(num!=0) {
		
		rev_num = rev_num * 10 + num % 10;
		num = num /10;
	}System.out.println(rev_num);

}
}