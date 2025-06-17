package operation;

import java.util.Scanner;

public class OPTest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("a: ");int a= sc.nextInt();
		System.out.println("b: ");int b= sc.nextInt();
				
		//산술연산
		System.out.println(a+"+"+ b+ "="+ (a+b));
		System.out.println(a+"-"+ b+ "="+ (a-b));
		System.out.println(a+"*"+ b+ "="+ (a*b));
		System.out.println(a+"/"+ b+ "="+ (a/(double)b)); //정수와 정수의 연산 결과는 정수
		System.out.println(a+"%"+ b+ "="+ (a%b));
		
		sc.close();
		System.out.println("종료");
	}
}
