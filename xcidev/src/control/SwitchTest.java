package control;

public class SwitchTest {
	public static void main(String[] args) {
		int n = 3;
		
		switch(n) {
		case 1,3: System.out.println("남자"); break; // 이런문법도 가능, 버전마다 상이함
		case 2: 
		case 4: System.out.println("여자"); break;
		default: System.out.println("에러"); break;
		}
		
		//
		switch(n) {
		case 1,3-> System.out.println("남자"); // break 빼려면 이렇게 가능
		case 2, 4-> System.out.println("여자");
		default -> System.out.println("에러");
		}
	}
}
