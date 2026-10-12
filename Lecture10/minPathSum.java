package Lecture10;

public class minPathSum {
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) {
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		solve(arr, 0, 0, 0);
		System.out.println(ans);
	}

	private static void solve(int[][] arr, int row, int col, int sum) {
		if (row == arr.length - 1 && col == arr[0].length - 1) {
			sum = sum + arr[arr.length - 1][arr[0].length - 1];
			ans = Math.min(ans, sum);
			return;
		}

		if (row < arr.length - 1) {
			solve(arr, row + 1, col, sum + arr[row][col]);
		}

		if (col < arr[0].length - 1) {
			solve(arr, row, col + 1, sum + arr[row][col]);
		}

	}

}
