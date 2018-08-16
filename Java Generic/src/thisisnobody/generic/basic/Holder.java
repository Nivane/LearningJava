package thisisnobody.generic.basic;

import java.lang.reflect.InvocationTargetException;

public class Holder<T> {

	private T t;

	public Holder(T t) {
		this.t = t;
	}

	public void set(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		Holder<String> holder = new Holder<>("hello");
		System.out.println(holder.getT());

		// ����Ǵ����Ͳ����Ĺ��������Ȼ�ȡ��������ָ������������newInstance()
		@SuppressWarnings("unchecked")
		Holder<String> holder1 = (Holder<String>) holder.getClass().getDeclaredConstructor(Object.class)
				.newInstance("hello");
		System.out.println(holder1.getT());

		System.out.println(holder.getClass().getDeclaredConstructor(Object.class).newInstance("hello1").getT());

	}

}
