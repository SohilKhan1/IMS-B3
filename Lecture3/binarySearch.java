package Lecture3;

public class binarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 7, 9, 11, 14, 18, 20, 23 };
		int target = 6;
		boolean ans = search(arr, target);
		System.out.println(ans);
	}
	private static boolean search(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (target == arr[mid]) {
				return true;
			} else if (target < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;

	}

}
