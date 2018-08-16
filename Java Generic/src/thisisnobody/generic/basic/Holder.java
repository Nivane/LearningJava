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

		// 如果是带类型参数的构造器，先获取构造器并指定参数类型再newInstance()
		@SuppressWarnings("unchecked")
		Holder<String> holder1 = (Holder<String>) holder.getClass().getDeclaredConstructor(Object.class)
				.newInstance("hello");
		System.out.println(holder1.getT());

		System.out.println(holder.getClass().getDeclaredConstructor(Object.class).newInstance("hello1").getT());

	}

}
