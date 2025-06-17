package ex;

public class ContinueControlKeyword {
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++) {
			continue;
		}
		
		for(int i =0; i < 10; i++) {
			System.out.print(i +" ");
			continue;
		}
		System.out.println();
		
		for(int i= 0; i<10; i++) {
			for(int j = 0; j <5; j++) {
				if(j ==3) {
					continue;
				}
				System.out.println(i +", "+ j);
			}
		}
		System.out.println();
		
		POS1: for(int i =0; i< 5; i++) { // go-to와 유사
			for(int j = 0; j <5; j++) {
				if(j == 3) {
					continue POS1;
				}
				System.out.println(i + ", "+ j);
			}
		}
	}
}
