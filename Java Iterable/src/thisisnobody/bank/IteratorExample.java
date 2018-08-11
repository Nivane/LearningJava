package thisisnobody.bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// 因为List接口(所有Collection接口)实现了Iterable接口，可以使用Iterable遍历方式
		for (Integer i : list) {
			System.out.println(i);
		}

		System.out.println("===================================");

		// 调用Iterable接口的iterator方法获取Iterator实例
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
