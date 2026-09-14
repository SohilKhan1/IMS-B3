package Lecture6;

public class stairPaths {
	public static void main(String[] args) {
		int n = 3;
		solve(n, "");
	}

	private static void solve(int n, String str) {
		if (n == 0) {
			System.out.println(str);
			return;
		}

		solve(n - 1, str + 1);
		if(n>=2)
		solve(n - 2, str + 2);
	}

}
