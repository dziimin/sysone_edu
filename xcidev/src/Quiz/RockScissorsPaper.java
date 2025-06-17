package Quiz;

import java.util.Scanner;

public class RockScissorsPaper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int you, com;
		boolean end = false;
		
		
		while(!end) {
			com = (int)(Math.random() * 3) +1;
			
			System.out.printf("가위는 1, 바위는 2, 보는 3을 입력 >");
			you = sc.nextInt();
			
			System.out.println("com : "+ com);
			if(you == com) {
				System.out.println("비김\n");
			}
			else if((you ==1 && com ==3) || (you == com +1)) {
				System.out.println("승리");
				end = true;
			}
			else{
				System.out.println("패배");
				end = true;
			}
		}
		sc.close();
	}
}
