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
 * �ڷ��ʹ����У��޷���ȡ�κ��йط������Ͳ�������Ϣ
 * ��ֻ��һ��Object
 * �κ�������ʱ��Ҫ֪��ȷ��������Ϣ�Ĳ������޷�����
 */
public class LostInformation {

	public static void main(String[] args) {

		List<Frob> list = new ArrayList<Frob>();
		Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();

		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
	}
}
