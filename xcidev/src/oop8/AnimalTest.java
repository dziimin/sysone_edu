package oop8;

public class AnimalTest {
	public static void main(String[] args) {

		/*
		 * 클래스, 인터페이스 사이의 형변환 1. 반드시 extends, implements 관계에서 가능 2. 업캐스팅 무조건 가능 3.
		 * 다운캐스팅은 원래 인스턴스가 현재 클래스 타입이거나 현재 클래스의 서브타입일 경우 가능 4. 현재 참조하는 타입에 정의되었거나 상속받은
		 * 멤버만 접근 가능.
		 */

		// Up-casting
		Animal a = new Animal();
		System.out.println(a);

		Animal a2 = new Bird();
		System.out.println(a2);
		// System.out.println(a2.wings()); 안됨

		Animal a3 = new Condor();
		System.out.println(a3);
		// animal 타입이므로 wings 안됨

		Bird b = new Condor();
		System.out.println(b);

		// Down-casting
		// Bird -> (up)Animal -> (down)Bird : 가능
		// Bird b2 = (Bird) new Animal();
		Bird b2 = (Bird) a2;
		System.out.println(b2);
		System.out.println(b2.wings());

		Bird b3 = (Bird) a3;
		System.out.println(b3);
		System.out.println(b3.wings());
		// bird 타입이므로 wings 가능

		Bird b4 = new Bird();
		System.out.println(b4);

		// Condor c1 = (Condor) b4; 에러
		Condor c2 = (Condor) b;
		System.out.println(c2);
		System.out.println(c2.attack());
		System.out.println(c2.wings());

		Condor c3 = (Condor) a3;
		System.out.println(c3);

		// Cat -> (Up)Animal -> (down)Bird : 에러
		Animal a4 = new Cat();
		System.out.println(a4);
		//Bird b5 = (Bird) a4;
	}
}
