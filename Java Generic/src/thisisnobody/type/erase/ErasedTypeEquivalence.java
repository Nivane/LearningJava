package thisisnobody.type.erase;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		Class c1 = new ArrayList<Integer>().getClass();
		@SuppressWarnings("rawtypes")
		Class c2 = new ArrayList<String>().getClass();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 == c2);
		// output
		// class java.util.ArrayList
		// class java.util.ArrayList
		// true

	}
}
