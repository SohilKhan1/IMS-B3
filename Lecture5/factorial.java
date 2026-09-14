package Lecture5;

public class factorial {
	public static void main(String[] args) {
		int n = 4;
		int ans = f(n);
		System.out.println(ans);
	}

	private static int f(int n) {
		if (n == 0) {
			return 1;
		}
		int sp = f(n - 1);
		int bp = sp * n;
		return bp;
	}
}
