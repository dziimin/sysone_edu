package operation;

public class OpTest3 {
	public static void main(String[] args) {
		boolean b1 = false, b2 = false;

		//논리연산
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println(!b1);
		
		//비트연산
		int n1=5, n2=3;
		System.out.println(n1 & n2); // 101 & 011 = 001
		System.out.println(n1 | n2); // 101 | 011 = 111
		System.out.println(~n1);     // ~101 = 010
		//임베디드에서 사용
		
		/* swap 대신 사용 가능 */
		System.out.println(n1 +"," + n2);
		n1 = n1^n2;
		n2 = n2^n1;
		n1 = n1^n2;
		System.out.println(n1 +"," + n2);
		
		
		System.out.println("종료");
	}
}
