package day4;

public abstract class Shape {
	public abstract void draw();
	
	public final void erase() {
		System.out.println("Erasing the shape using an eraser");
	}
}
