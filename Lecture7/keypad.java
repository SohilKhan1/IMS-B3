package Lecture7;

import java.util.*;

public class keypad {
	static String arr[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String digit = "23";
		solve(digit, "", list);
		System.out.println(list);
		// return list;

	}

	private static void solve(String digit, String ans, List<String> list) {
		if (digit.length() == 0) {
			list.add(ans);
			return;
		}

		char ch = digit.charAt(0);
		String key = arr[ch - '0'];

		for (int i = 0; i < key.length(); i++) {
			solve(digit.substring(1), ans + key.charAt(i), list);
		}

	}

}
