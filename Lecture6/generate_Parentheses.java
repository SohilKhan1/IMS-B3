package Lecture6;

import java.util.*;

public class generate_Parentheses {
	public static void main(String[] args) {
		int n = 3;
		List<String> list = new ArrayList<>();
		solve(n, 0, 0, "", list);
		System.out.println(list);
//		return list;
	}

	private static void solve(int n, int open, int close, String str, List<String> list) {
		if (open == n && close == n) {
			// System.out.println(str);
			list.add(str);
			return;
		}

		if (open < n)
			solve(n, open + 1, close, str + "(",list);
		if (close < open)
			solve(n, open, close + 1, str + ")",list);

	}

}
