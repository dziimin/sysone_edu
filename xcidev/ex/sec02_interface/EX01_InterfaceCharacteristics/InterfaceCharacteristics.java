package sec02_interface.EX01_InterfaceCharacteristics;

interface A {
	public static final int a = 3;

	public abstract void abc();
}

interface B {
	int b = 3;

	void bcd();
}

public class InterfaceCharacteristics {
	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(B.b);

//		A.a = 5;
//		B.b = 5
	}
}
