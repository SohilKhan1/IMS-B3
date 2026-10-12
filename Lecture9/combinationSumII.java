package Lecture9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSumII {
	public static void main(String[] args) {
		int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		Arrays.sort(arr);
		int target = 8;
		int idx = 0;
		List<Integer> list = new ArrayList<>();
		solve(arr, target, list, idx);
	}

	private static void solve(int[] arr, int target, List<Integer> list, int idx) {

		if (target == 0) {
			System.out.println(list);
			return;
		}

		for (int i = idx; i < arr.length; i++) {
			if (i > idx && arr[i] == arr[i - 1]) {
				continue;
			}
			list.add(arr[i]);
			solve(arr, target - arr[i], list, i + 1);
			list.remove(list.size() - 1);
		}

	}

}
