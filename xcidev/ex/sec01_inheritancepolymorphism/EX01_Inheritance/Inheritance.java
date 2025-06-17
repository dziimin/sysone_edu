package sec01_inheritancepolymorphism.EX01_Inheritance;

class Human {
	String name;
	int age;

	void eat() {
		System.out.println("먹음");
	}

	void sleep() {
		System.out.println("잠");
	}
}

class Student extends Human {
	int studentID;

	void goToSchool() {
		System.out.println("학교감");
	}
}

class Worker extends Human {
	int workID;

	void goToWork() {
		System.out.println("일감");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		// Human 객체 생성
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();

		// Student 객체 생성
		Student s = new Student();
		s.name = "김민성";
		s.age = 16;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();

		// Worker 객체 생성
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workID = 128;
		w.eat();
		w.sleep();
		w.goToWork();
	}
}
