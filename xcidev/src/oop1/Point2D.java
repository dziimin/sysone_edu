package oop1;

public class Point2D {
	private int x;
	private int y;
 	
	// (커서위치 주의) alt + shift + s >> getter setter	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		System.out.println("x = " + this.getX());
		System.out.println("y = " + getY());
	}
}
