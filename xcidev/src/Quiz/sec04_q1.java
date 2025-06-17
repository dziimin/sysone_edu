package Quiz;

public class sec04_q1 {
	public static void main(String[] args) {
		
		// 1 
		int score = 72;

		if (80 <= score && score < 90) {
			System.out.println("B학점");
		} else if (score >= 90) {
			System.out.println("A학점");
		} else if (70 <= score && score < 80) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
		
		// 3
		for(int i = 0; ;i++) {
			if(i>10) break;
			if(i%2 ==0)
				System.out.println(i);
		}
		
		//6
		out:
		for(int i =0; i <10 ; i++) {
			for(int j = 0; j < 5; j++) {
				//System.out.println(i +", "+ j);
				if( i ==3 && j ==2) break out;
			}
		}
	}
}
