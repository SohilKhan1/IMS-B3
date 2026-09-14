package Lecture6;

public class coinToss {
	public static void main(String[] args) {
		int n = 3;
		solve(n, "");
	}

	private static void solve(int n, String str) {
		if (n == 0) {
			System.out.println(str);
			return;
		}
		solve(n-1, str+"H");
		solve(n-1, str+"T");

	}

}
