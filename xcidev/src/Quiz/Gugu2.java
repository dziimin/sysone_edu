package Quiz;

public class Gugu2 {
	public static void main(String[] args) {

		// 구구단 for문 3개로 만들기
		// 2단 3단 4단 5단
		// 6단 7단 8단 9단
		
		for (int block = 0; block < 2; block++) {
			for (int i = 1; i < 10; i++) {
				for (int dan = 2; dan <= 5; dan++) {
					System.out.printf((dan+ 4*block) + "*" + i + "=" + (dan+ 4*block)*i + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println();
		//2 소영vers		
		for (int i=2; i<=9; i+=4) {
            for (int j=1; j<=9; j++) {
                for (int k=0; k<=3; k++) { // 단을 증가시킨다
                    System.out.print(i+k + "*" + j + "=" + (i+k)*j + "\t");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
		
		
		System.out.println();
		//3 교수님		
		for(int i = 2; i<= 9; i+=4) {
			for(int j =1 ; j<=9; j++) {
				for(int k =i; k<i+4; k++) {
					System.out.print(k +"*"+ j +"="+ k*j+ "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
