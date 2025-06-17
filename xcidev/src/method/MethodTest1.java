package method;

public class MethodTest1 {
	public static void main(String[] args) {
		print("신해철"); // parameter
		print();
	}

	private static void print() { //오버로딩
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
	}
	private static void print(String name) { // name : arguments
		// TODO Auto-generated method stub
		System.out.println("+------+");
		System.out.println("+" + name + "+");
		System.out.println("+------+");
	}
}
