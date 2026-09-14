package Lecture2;

import java.util.Arrays;

public class nextPermutation {
	public static void main(String[] args) {
//		int[] arr = { 6, 3, 5, 4, 2, 1 };
		int[] arr = { 3, 2, 1 };

		int p = 0;

		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i - 1] < arr[i]) {
				p = i - 1;
				break;
			}
		}

		int q = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[p] < arr[i]) {
				q = i;
				break;
			}
		}

		if (p == q) {
			reverse(arr, 0, arr.length - 1);
			System.out.println(Arrays.toString(arr));
			return;
		}

		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		reverse(arr, p + 1, arr.length - 1);

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

}
