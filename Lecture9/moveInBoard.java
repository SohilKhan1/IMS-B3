package Lecture9;

public class moveInBoard {
	public static void main(String[] args) {
		boolean[][] arr = new boolean[3][3];
		solve(arr, 0, 0, "");

	}

	private static void solve(boolean[][] arr, int row, int col, String ans) {

		if (row == arr.length - 1 && col == arr[0].length - 1) {
			System.out.println(ans);
			return;
		}

		//right move 
		if (col < arr[0].length - 1) {
			if (arr[row][col + 1] == false) {
				arr[row][col + 1] = true;
				solve(arr, row, col + 1, ans + "R");
				arr[row][col + 1] = false;
			}
		}

		//Down move
		if (row < arr.length - 1) {
			if (arr[row + 1][col] == false) {
				arr[row + 1][col] = true;
				solve(arr, row + 1, col, ans + "D");
				arr[row + 1][col] = false;
			}

		}
		
		//Left move 
		if (col > 0) {
			if (arr[row][col] == false) {
				arr[row][col - 1] = true;
				solve(arr, row, col - 1, ans + "L");
				arr[row][col - 1] = false;
			}
		}

		//Upper move
		if (row > 0) {
			if (arr[row - 1][col] == false) {
				arr[row - 1][col] = true;
				solve(arr, row - 1, col, ans + "U");
				arr[row - 1][col] = false;
			}

		}

	}

}
