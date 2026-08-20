package Lecture1;

public class mostWater {

	public static void main(String[] args) {
		int [] arr = {1,8,6,2,5,4,8,3,7};
		solve(arr);
		solve2(arr);
	}
	private static void solve2(int[] arr) {
		int ans =0;
		int st = 0;
		int end = arr.length-1;
		
		while(st<end) {
			int h = Math.min(arr[st], arr[end]);
			int w = end-st;
			ans = Math.max(ans, w*h);
			
			if(arr[st]<arr[end]) {
				st++;
			}else {
				end--;
			}
		}
		System.out.println(ans);
		
	}
	private static void solve(int[] arr) {
		int ans =0;
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				int h = Math.min(arr[i], arr[j]);
				int w = j-i;
				int water = h*w;
				ans=Math.max(ans, water);
			}
		}
		System.out.println(ans);
		
		
	}

}
