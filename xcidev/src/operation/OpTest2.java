package operation;

import java.util.Scanner;

public class OpTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a: ");int a= sc.nextInt();
		System.out.println("b: ");int b= sc.nextInt();
		
		//관계연산
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		sc.close();
	}
}
