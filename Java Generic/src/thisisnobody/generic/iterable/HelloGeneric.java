package thisisnobody.generic.iterable;

import java.util.Arrays;

class List<E> {

	void print() {
		System.out.println(Arrays.asList(this.getClass().getTypeParameters()).toString());

	}

}

public class HelloGeneric<T> extends List<Object> {

	public static void main(String[] args) {

		List<Object> e = new List<Object>();
		e.print();

		HelloGeneric<?> hg = new HelloGeneric<>();
		hg.print();
	}

}
