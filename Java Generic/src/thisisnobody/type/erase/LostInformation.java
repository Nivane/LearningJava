package thisisnobody.type.erase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Frob {
}

class Fnorkle {
}

class Quark<Q> {
}

class Particle<POSITION, MOMENTUM> {
}
/**
 * 
 * 
 * @author ZLP
 * 在泛型代码中，无法获取任何有关泛型类型参数的信息
 * 都只是一个Object
 * 任何在运行时需要知道确切类型信息的操作都无法工作
 */
public class LostInformation {

	public static void main(String[] args) {

		List<Frob> list = new ArrayList<Frob>();
		Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();

		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
	}
}
