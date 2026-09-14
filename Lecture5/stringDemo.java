package Lecture5;

public class stringDemo {
	public static void main(String[] args) {
		String s1 = "hello";
//		String s2 = "hello";
//		System.out.println(s1 == s2);

		String s3 = new String("hello");
//		System.out.println(s1 == s3);

		String s4 = new String("hello");
//		System.out.println(s3 == s4);

//		s1 = s1+"A";
//		System.out.println(s1 + "A");
//		System.out.println(s1);

		System.out.println(s1.equals(s3));

	}

}
