package Lecture3;

public class kokoOpt {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 7, 11 };
		int h = 8;

		int low = 1;
		int high = 0;
		for (int a : arr) {
			high = Math.max(a, high);
		}
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (canFinish(mid, arr, h) == true) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.println(ans);
	}

	private static boolean canFinish(int speed, int[] arr, int h) {
		int totaltime = 0;
		for (int i = 0; i < arr.length; i++) {
			int t = arr[i] / speed;
			if (arr[i] % speed != 0) {
				t = t + 1;
			}
			totaltime += t;
		}
		if (totaltime <= h)
			return true;

		return false;
	}

}
