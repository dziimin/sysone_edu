package oop7;

public class PointTest {
	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		p1.x = 100;
		p1.y = 200;
		// p1.z = 300

		// up-casting
		Point2D p2 = new Point3D();
		p2.x = 1000;
		p2.y = 2000;
		// p2.z = 3000;

		//Point3D p3 = (Point3D) new Point2D(); 컴파일시 오류
		// down-casting
		Point3D p3 = (Point3D) p2;
		p3.x = 10000;
		p3.y = 20000;
		p3.z = 30000;

	}
}
