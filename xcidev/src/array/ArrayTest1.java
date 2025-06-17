package array;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] s = new int[3];
		s[0] = 100;
		s[1] = 200;
		s[2] = 300;
		//s[3] = 400; out of bounds for length 3
		
		System.out.println(s);
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		for(int i = 0 ; i< s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
