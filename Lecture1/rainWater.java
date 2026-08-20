package Lecture1;

public class rainWater {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		solve(arr);
	}

	private static void solve(int[] arr) {
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int lmax = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > lmax) {
					lmax = arr[j];
				}
			}

			int rmax = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > rmax) {
					rmax = arr[j];
				}
			}

			int water = Math.min(lmax, rmax) - arr[i];
			ans += water;

		}
		System.out.println(ans);

	}

}
