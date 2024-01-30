package logical;

public class MinValue {

	public static void main(String[] args) {

		 int[] array = {2, 3, 4, 1, 5, 6, 7};
	        int min = array[0];

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }

	        System.out.println("The minimum number is: " + min);
	}

}
