package Logical;

public class Duplicate_num {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 1, 2};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println("Duplicate num from arr is " + arr[i]);
				}
			}
		}
	}

}
