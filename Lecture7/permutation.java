package Lecture7;

public class permutation {
	public static void main(String[] args) {
		String s = "abc";
		solve(s, "");
	}

	private static void solve(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			solve(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
		}

	}

}
