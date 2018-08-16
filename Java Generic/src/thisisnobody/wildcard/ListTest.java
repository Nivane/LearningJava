package thisisnobody.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Apple extends Fruit {
}

class Fruit {
}

public class ListTest {

	public static void main(String[] args) {

		List<? extends Fruit> list = new ArrayList<Apple>();
		// 编译器并不知道到底放了哪种水果，所以编译出错
		// list.add(new Apple());// Compile error
		// list.add(new Fruit());// Compile error

		list.add(null);
		Fruit f = list.get(0);
		System.out.println(f);
		List<? extends Fruit> flist = Arrays.asList(new Apple());
		// flist.add(new Apple());
		Apple a = (Apple) flist.get(0);
		System.out.println(a);
		System.out.println(flist.contains(new Apple()));
		System.out.println(flist.indexOf(new Apple()));

	}
}
