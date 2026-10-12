package Lecture8;

import java.util.*;

public class backtrackingDemo {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		int target = 7;
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		solve(arr, target, list, ans, 0);
		System.out.println(ans);
	}

	private static void solve(int[] arr, int target, List<Integer> list, List<List<Integer>> ans, int idx) {
		if (target == 0) {
			System.out.println(list);
//			List<Integer> aa = new ArrayList<>(list);
//			ans.add(aa);
//			ans.add(new ArrayList<Integer>(list));
			return;
		}
		if (target < 0) {
			return;
		}
		for (int i = idx; i < arr.length; i++) {
			list.add(arr[i]);
			solve(arr, target - arr[i], list, ans, i);
			list.remove(list.size() - 1);
		}
	}

}
