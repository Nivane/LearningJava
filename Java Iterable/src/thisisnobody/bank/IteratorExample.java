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

		// ��ΪList�ӿ�(����Collection�ӿ�)ʵ����Iterable�ӿڣ�����ʹ��Iterable������ʽ
		for (Integer i : list) {
			System.out.println(i);
		}

		System.out.println("===================================");

		// ����Iterable�ӿڵ�iterator������ȡIteratorʵ��
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
