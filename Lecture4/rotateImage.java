package Lecture4;

public class rotateImage {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		int a = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a;
				a++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		rotate(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void rotate(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for (int row = 0; row < arr.length; row++) {
			int start = 0;
			int end = arr[0].length - 1;
			while (start < end) {
				int temp = arr[row][start];
				arr[row][start] = arr[row][end];
				arr[row][end] = temp;
				start++;
				end--;
			}
		}

	}

}
