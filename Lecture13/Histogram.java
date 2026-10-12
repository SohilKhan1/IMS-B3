package Lecture13;

public class Histogram {
	public static void main(String[] args) {
		int arr[] = { 2, 1, 5, 6, 2, 3 };
		solve(arr);
	}

	private static void solve(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// left smaller
			int m = i - 1;
			while (m >= 0) {
				if (arr[m] < arr[i]) {
					break;
				}
				m--;
			}
			// right smaller
			int n = i + 1;
			while (n < arr.length) {
				if (arr[n] < arr[i]) {
					break;
				}
				n++;
			}
			int w = n - m - 1;
			int area = arr[i] * w;
			System.out.println(area);
		}
	}

}
