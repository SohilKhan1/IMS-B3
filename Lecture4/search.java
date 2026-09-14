package Lecture4;

public class search {
	public static void main(String[] args) {
		int[][] arr = new int[4][5];
		int x = 7;

		int a = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a;
				a++;
			}
		}
		search(arr, x);
		boolean s = searchOpt(arr, x);
		System.out.println(s);

	}

	private static boolean searchOpt(int[][] arr, int target) {

		int row = 0;
		int col = arr[0].length - 1;

		while (row < arr.length && col >= 0) {
			if (arr[row][col] == target) {
				return true;
			} else if (arr[row][col] < target) {
				row++;
			} else {
				col--;
			}
		}

		return false;

	}

	private static void search(int[][] arr, int x) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == x) {
					flag = true;
					break;
				}
			}
		}

		if (flag == true) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}
}
