package sec03_throwsexception.EX01_ThrowsException_1;

class A{
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

// 2. 예외 전가
class B{
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	void bcd() throws InterruptedException{
		Thread.sleep(1000);
	}
}

public class ThrowsException_1 {
	public static void main(String[] args) {
		
	}
}
