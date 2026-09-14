package Lecture6;

public class countPaths {
	static int count = 0;

	public static void main(String[] args) {
		int n = 3;
		int ans = solve(n);
		System.out.println(ans);
		System.out.println(count);
	}

	private static int solve(int n) {
		if (n == 0) {
			count++;
			return 1;
		}

		int a = solve(n - 1);
		int b = 0;
		if (n >= 2)
			b = solve(n - 2);

		return a + b;
	}

}
