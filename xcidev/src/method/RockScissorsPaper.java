package method;

import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) { // try with resources
			System.out.print("가위는 1, 바위는 2, 보는 3 입력 >> ");
			int you = sc.nextInt();
			int com = (int) (Math.random() * 3) + 1;
			
			System.out.println("You : "+ caption(you));
			System.out.println("com : "+ caption(com));
			// String[] caption={"가위","바위","보"};
			// System.out.println("You : "+ caption[you-1]);
			// System.out.println("Com : "+ caption[com-1]);
			
			System.out.println();
			System.out.println("결과 : "+compare(you, com));
			
			
			//printCaption(you);
			//printCaption(com);
		}
	}

	private static String compare(int you, int com) {
		// TODO Auto-generated method stub
		if(you==com) {
			return "비김";
		} else if(you == com%3+1) {
			return "이김";
		} else {
			return "짐";
		}
	}

	private static void printCaption(int val) {
		switch(val) {
		case 1: System.out.println("가위"); break;
		case 2: System.out.println("바위"); break;
		case 3: System.out.println("보"); break;
		default: System.out.println("에러"); break;
		}
	}

	private static String caption(int val) {
		switch(val) {
		case 1: return "가위";
		case 2: return "바위";
		case 3: return "보";
		default: return "에러";
		}
	}
	
	
}
