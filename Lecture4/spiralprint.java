package Lecture4;

public class spiralprint {
	public static void main(String[] args) {
		int[][] arr = new int[5][3];

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

		print(arr);
	}

	private static void print(int[][] arr) {
		int minc = 0;
		int minr = 0;
		int maxc = arr[0].length - 1;
		int maxr = arr.length - 1;
		int total = arr.length * arr[0].length;
		int count = 0;

		while (count < total) {
			for (int i = minc; i <= maxc && count < total; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;
			}
			minr++;

			System.out.println();
			for (int i = minr; i <= maxr && count < total; i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;
			

			System.out.println();
			for (int i = maxc; i >= minc && count < total; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;
			System.out.println();
			for (int i = maxr; i >= minr && count < total; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;
			System.out.println();

		}
	}

}
