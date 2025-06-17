package sec03_constructor.EX01_DefaultConstructor;

class A {
	int m;

	void work() {
		System.out.println(m);
	}
	// 기본 생성자 직접 정의 x
}

class B {
	int m;

	void work() {
		System.out.println(m);
	}

	B() {

	}
}

class C {
	int m;

	void work() {
		System.out.println(m);
	}

	C(int a) { // 기본생성자 x 정의
		m = a;
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {

		A a = new A(); // (자동)기본생성자 호출 가능
		B b = new B();
		// C c = new C(); 기본 생성자 호출 불가능
		C c = new C(3);

		a.work();
		b.work();
		c.work();
	}
}
