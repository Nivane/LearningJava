package thisisnobody.entryset;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author ZLP
 * 遍历Map
 * Entry是Map的内部类
 */
public class EntrySetExample {
	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 5);
		map.put(2, 4);
		map.put(3, 3);
		map.put(4, 2);
		map.put(5, 1);

		Set<Entry<Integer, Integer>> set = map.entrySet();

		for (Entry<Integer, Integer> i : set) {
			System.out.println(i.getKey());
			System.out.println(i.getValue());
			System.out.println("--------------");
		}

	}
}
