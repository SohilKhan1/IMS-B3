package Lecture11;

import java.util.Arrays;
 
public class Nqueens {
	public static void main(String[] args) {

		int n = 4;
		char[][] board = new char[n][n];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '.';
			}
		}
		solve(board, n, 0, 0);
	}

	private static void solve(char[][] board, int n, int row, int col) {
		if (col == n) {
			col = 0;
			row = row + 1;
		}
		if (row == n) {
			for (char[] a : board) {
				System.out.println(Arrays.toString(a));
			}
			System.out.println("=======");
			return;
		}
		for (int i = 0; i < n; i++) {
			if (board[row][i] == 'Q') {
				solve(board, n, row + 1, col);
			} else {
				if (calPlace(board, n, row, i)) {
					board[row][i] = 'Q';
					solve(board, n, row + 1, col);
					board[row][i] = '.';
				}
			}
		}

	}

	private static boolean calPlace(char[][] board, int n, int row, int col) {
		// for row
		for (int i = 0; i < n; i++) {
			if (board[row][i] == 'Q')
				return false;
		}
		// for column
		for (int i = 0; i < n; i++) {
			if (board[i][col] == 'Q')
				return false;
		}
		// for ULD
		int r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c] == 'Q')
				return false;
			r--;
			c--;
		}
		// for URD
		r = row;
		c = col;
		while (r >= 0 && c < n) {
			if (board[r][c] == 'Q')
				return false;
			r--;
			c++;
		}
		return true;

	}

}
