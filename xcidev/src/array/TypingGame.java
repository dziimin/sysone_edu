package array;

import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		String[] words = { "Java", "James Gosling", "Green Project", "Java Development Kit", "Spring Framework",
				"React", "Node.js", "Write once, Run anwhere", "sysone", "oracle database" };

		Scanner sc = new Scanner(System.in);
		
		System.out.println("타이핑 게임");
		
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <= 5; i++) {
			int randomeNumber = (int) (Math.random() * words.length);
			do {
				System.out.print(i + ": " + words[randomeNumber] + " > ");
				String keyword = sc.nextLine(); // nextLine() : 공백도 읽기위해

				if (!keyword.equals(words[randomeNumber])) {
					System.out.println("오타입니다. 다시 입력하세요.");
				} else {
					break;
				}

			} while (true);
		}

		long endTime = System.currentTimeMillis();
		double runningTime = ((double) endTime - startTime) / 1000;
		
		System.out.println("총 소요시간은 "+ runningTime+ "초 입니다.");
	
	}
}
