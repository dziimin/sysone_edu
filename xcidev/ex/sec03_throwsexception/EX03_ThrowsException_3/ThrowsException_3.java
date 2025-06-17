package sec03_throwsexception.EX03_ThrowsException_3;

// 1. 하위 메서드에서 직접 예외 처리
class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		} catch (InterruptedException | ClassNotFoundException e) {
			
		}
	}
}

// 2. 예외를 호출 메서드로 전가
class B{
	void abc() {
		try {
			bdc();
		} catch (InterruptedException | ClassNotFoundException e) {
			// TODO: handle exception
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}


public class ThrowsException_3 {
	public static void main(String[] args) {
		
	}
}
