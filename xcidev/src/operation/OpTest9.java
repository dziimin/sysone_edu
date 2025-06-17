package operation;

public class OpTest9 {
	public static void main(String[] args) {
		int a = 10;
		
		a += 2;
		
		System.out.println(a);
		
		a -= 2;
		System.out.println(a);
		
		a *= 2;
		System.out.println(a);
		
		a /= 2;
		System.out.println(a);

		a %= 2;
		System.out.println(a);
		
		// a>>=2 우시프트 연산도 축약 가능
	}
}
