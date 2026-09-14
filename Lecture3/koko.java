package Lecture3;

public class koko {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 7, 11 };
		int h = 8;
		int speed = 1;
		while (true) {
			int totaltime = 0;
			for (int i = 0; i < arr.length; i++) {
				int t = arr[i] / speed;
				if (arr[i] % speed != 0) {
					t = t + 1;
				}
				totaltime += t;
			}
			if (totaltime <= h) {
				break;
			}
			speed = speed + 1;
		}
		System.out.println(speed);

	}

}
