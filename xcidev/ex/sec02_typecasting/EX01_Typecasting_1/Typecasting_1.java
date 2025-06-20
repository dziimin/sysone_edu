package sec02_typecasting.EX01_Typecasting_1;

class A {
}

class B extends A {
}

class C extends B {
}

class D extends B {
}

public class Typecasting_1 {
	public static void main(String[] args) {

		// 업캐스팅(자동 변환) : 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
		A ac = (A) new C(); // C -> A 업캐스팅(자동)
		B bc = (B) new C(); // C -> B up

		B bb = new B();
		A a = (A) bb;

		// 다운캐스팅(수동)
		A aa = new A();
//		B b = (B) aa;
//		C c = (C) aa;

		A ab = new B();
		B b = (B) ab;
//		C c = (C) ab;

		B bd = new D();
		D d = (D) bd;

		A ad = new D();
		B b1 = (B) ad;
		D d1 = (D) ad;
	}
}
