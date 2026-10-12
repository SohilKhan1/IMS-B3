package Lecture11;

public class wordSearch {
	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "FCED";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == word.charAt(0)) {
					System.out.println(solve(board, word, 1, i, j));
				}
			}
		}
	}

	private static boolean solve(char[][] board, String word, int idx, int row, int col) {
		if (idx == word.length()) {
			return true;
		}
		int[] r = { 0, 1, 0, -1 };
		int[] c = { 1, 0, -1, 0 };

		boolean flag = false;

		for (int i = 0; i < c.length; i++) {
			int nr = row + r[i];
			int nc = col + c[i];
			if (nr >= 0 && nc >= 0 && nr < board.length && nc < board[0].length) {
				if (board[nr][nc] == '*') {
					continue;
				} else {
					char ch = board[nr][nc];
					if (ch == word.charAt(idx)) {
						board[nr][nc] = '*';
						flag = solve(board, word, idx + 1, nr, nc);
						board[nr][nc] = ch;
					}
				}
			}
		}
		return flag;
	}

}
