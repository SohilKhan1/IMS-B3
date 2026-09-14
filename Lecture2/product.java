package Lecture2;

import java.util.Arrays;

public class product {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] ans = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			int lpro = 1;
			for (int j = i - 1; j >= 0; j--) {
				lpro *= arr[j];
			}

			int rpro = 1;
			for (int j = i + 1; j < arr.length; j++) {
				rpro *= arr[j];
			}
			ans[i] = lpro * rpro;

		}
		System.out.println(Arrays.toString(ans));

	}

}
