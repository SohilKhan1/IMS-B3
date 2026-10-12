package Lecture10;

public class moveInBoard {
	static int count = 0;

	public static void main(String[] args) {
		boolean[][] arr = new boolean[3][3];
		solve(arr, 0, 0, "");
		System.out.println(count);

	}

	private static void solve(boolean[][] arr, int row, int col, String ans) {

		if (row == arr.length - 1 && col == arr[0].length - 1) {
			count++;
			return;
		}

		int[] r = { -1, 0, 1, 0 };
		int[] c = { 0, 1, 0, -1 };

		for (int i = 0; i < r.length; i++) {
			int nr = row + r[i];
			int nc = col + c[i];

			if (nr >= 0 && nc >= 0 && nr <= arr.length - 1 && nc <= arr[0].length - 1) {
				if (arr[nr][nc] == false) {
					arr[nr][nc] = true;
					solve(arr, nr, nc, ans);
					arr[nr][nc] = false;
				}
			}
		}

	}

}
