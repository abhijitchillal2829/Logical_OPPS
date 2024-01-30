package Logical_Programme_Pune;

import java.util.Arrays;

public class Replace_Num_First_Last {

	public static void main(String[] args) {

		int num[] = { 1, 2, 3, 4, 5 };
		
		int tem = num[0];                   //1
		num[0] = num[num.length-1];         //5
		num[num.length-1] = tem;            //5 = 1
		System.out.println(Arrays.toString(num));
		
		System.out.println();
		
		int num1[] = {10, 20, 30, 40, 50};
		int tem1 = num1[1];           //20
		num1[1] = num1[num1.length-2];    //40
		num1[num1.length-2] = tem1;       // 40 = 20
		System.out.println(Arrays.toString(num1));
		
		
	}

}
