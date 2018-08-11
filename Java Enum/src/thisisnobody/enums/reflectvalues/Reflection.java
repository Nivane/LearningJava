package thisisnobody.enums.reflectvalues;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore {
	HERE, THERE
}

public class Reflection {

	public static Set<String> analyze(Class<?> enumClass) {
		Set<String> set = new TreeSet<String>();
		System.out.println("Interfaces: ");
		for (Type t : enumClass.getGenericInterfaces()) {
			System.out.println(t);
		}

		for (Method m : enumClass.getMethods()) {
			set.add(m.getName());
		}

		System.out.println(set);
		return set;

	}

	public static void main(String[] args) {
		Set<String> enumMethods = analyze(Enum.class);
		Set<String> exploreMethods = analyze(Explore.class);
		exploreMethods.removeAll(enumMethods);
		//差集，values由编译器提供
		System.out.println(exploreMethods);

	}
}
