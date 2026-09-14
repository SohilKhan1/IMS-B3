package Lecture5;

public class palindrom {
	public static void main(String[] args) {
		String s = "nitin";
		System.out.println(ispalindrom(s));
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
