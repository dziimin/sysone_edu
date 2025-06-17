package sec02_interface.EX05_CreateObjectOfInterface_2;

interface A {
	int a = 3;

	void abc();
}

class A3 {
	int a,b,c,d;
	A3(){
		this(5);
	}
	A3(int k){
		a = k;
		b = k;
		c=k;
		d=k;
	}
}

public class CreateObjectOfInterface_2 {
	public static void main(String[] args) {
		A a1 = new A() {
			public void abc() {
				System.out.println("방벙 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		A a2 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};

		a1.abc();
		a2.abc();
		
		
		//
		A3 a = new A3();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		
	}
}
