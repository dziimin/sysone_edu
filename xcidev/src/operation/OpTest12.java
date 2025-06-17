package operation;

import java.util.Scanner;

public class OpTest12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(a%2==0 ? a+"는 짝수입니다.": a+"는 홀수입니다.");
		System.out.println(Math.abs(a)%2==0 ? a+"는 짝수입니다.": a+"는 홀수입니다.");
		
		// System.out.println(a%2==1 ? a+"는 홀수입니다.": a+"는 짝수입니다."); 
		// 입력값의 부호를 따라가기때문에 음수 입력 주의-> 절대값 연산, Math.abs(a) 등 사용
		
		sc.close();
	}
}