package method;

public class MethodTest5 {
	public static void main(String[] args) {
		int[] a = { 10 };

		callref(a);

		System.out.println("callref: "+ a[0]);
		System.out.println();
	}

	private static void callref(int[] a) { // call by reference
		System.out.println("callref: " + a[0]);
		a[0]++;
		System.out.println("callref: " + a[0]);		
	}
}
