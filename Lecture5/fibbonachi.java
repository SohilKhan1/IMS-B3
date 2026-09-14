package Lecture5;

public class fibbonachi {
	public static void main(String[] args) {
		int n = 5;
		int ans = fibb(n);
		System.out.println(ans);
	}

	private static int fibb(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		int a = fibb(n - 1);
		int b = fibb(n - 2);
		return a + b;
	}
}
