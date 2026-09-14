package Lecture4;

 
public class TwoDArrays {
	public static void main(String[] args) {
		int[][] arr = new int[4][5];

//		// rows
//		System.out.println(arr.length);
//
//		// cols
//		System.out.println(arr[0].length);

		int a = 1;
		// enter data
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = a;
				a++;
			}
		}

		// print
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
