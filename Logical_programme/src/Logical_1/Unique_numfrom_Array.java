package Logical_1;

public class Unique_numfrom_Array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 1, 2, 3 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					count++;
				}
			}
			if (count == 1) {
				System.out.println("Unique num from array is :" + arr[i]);
			}
		}

	}

}
