package control;

import java.util.Scanner;

public class SwitchTest4 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt()/10;

		// alt + shift + a : 컬럼모드(?)변환
		switch (n) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		sc.close();
	}
}
