package Lecture7;

public class subseq {
	public static void main(String[] args) {
		String s = "abc";
		solve(s, "");
	}
	private static void solve(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		solve(s.substring(1), ans + s.charAt(0));
		solve(s.substring(1), ans);
	}
}
