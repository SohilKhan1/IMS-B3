package Lecture5;

public class printpalindromic {
	public static void main(String[] args) {
		String s = "nitin";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String str = s.substring(i, j);
				if (ispalindrom(str) == true) {
					System.out.println(str);
				}
			}
		}

	}

	private static boolean ispalindrom(String s) {
		int st = 0;
		int end = s.length() - 1;
		while (st < end) {
			if (s.charAt(st) != s.charAt(end)) {
				return false;
			}
			st++;
			end--;
		}

		return true;
	}

}
