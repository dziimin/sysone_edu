package method;

public class MethodTest4 {
	public static void main(String[] args) {
		
		// 가변형 아규먼트를 이용한 오버로딩
		prn(1);
		prn(2, 3);
		prn(2, 3, 4);
		
		prn(1,2,3,4,4,5,5,6,6,6,5,5);
	}

	/*
	private static void prn(int i, int j, int k) {
		System.out.println(i + "\t" + j + "\t" + k);
	}

	private static void prn(int i, int j) {
		System.out.println(i + "\t" + j);
	}

	private static void prn(int i) {
		System.out.println(i);
	}
	*/	
	// 가변형으로 변경 : 파라미터가 같은 타입일때만 가능
	
	private static void prn(int...n) {
		for(int i:n) {
			System.out.print(i+"\t");
		}
		System.out.println();
	}
}
