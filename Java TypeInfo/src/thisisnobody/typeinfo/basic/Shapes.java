package thisisnobody.typeinfo.basic;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	void draw() {
		System.out.println(this + ".draw()");
	}

	public abstract String toString();
}

class Triangle extends Shape {

	@Override
	public String toString() {
		return "Triangle";
	}
}

class Circle extends Shape {

	@Override
	public String toString() {
		return "Circle";
	}

}

public class Shapes {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>();
		list.add(new Triangle());
		list.add(new Circle());

		for (Shape s : list) {
			s.draw();
		}

	}
}
