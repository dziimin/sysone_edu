package operation;

public class OpTest14 {
	public static void main(String[] args) {
		int n = (int)3.9999; //강제형변환, 명시적 형변환 => 버림된다
		System.out.println(n);
		
		double d = 10; // 자동형변환, 묵시적 형변환
		System.out.println(d);
	}
}
