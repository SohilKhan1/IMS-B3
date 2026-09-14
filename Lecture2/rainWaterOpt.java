package Lecture2;

public class rainWaterOpt {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		solve(arr);
	}

	private static void solve(int[] arr) {

		int left[] = new int[arr.length];
		left[0] = arr[0];

		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}

		int right[] = new int[arr.length];
		right[right.length - 1] = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}

		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			int w = Math.min(left[i], right[i]) - arr[i];
			ans += w;
		}

		System.out.println(ans);

	}

}
