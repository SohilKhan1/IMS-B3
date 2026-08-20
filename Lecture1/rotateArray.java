package Lecture1;

import java.util.Arrays;

public class rotateArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		
		rotate(arr, k);

//		optSolution
		k = k % arr.length;
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	private static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

	private static void rotate(int[] arr, int k) {

		for (int j = 1; j <= k; j++) {

			int temp = arr[arr.length - 1];

			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

}
