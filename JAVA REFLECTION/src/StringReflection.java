import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 
 * @author ZLP 2018.06.18 使用反射机制 反射是在运行时程序访问检查修改自身结构和状态的能力
 * 
 */
public class StringReflection {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) throws Exception {
		String str = "hello world";
		/*
		 * 获取对象类的三种方法
		 */
		// 对象调用getClass()
		Class<? extends String> strClass1 = str.getClass();
		// Class.forName()
		Class<?> strClass2 = Class.forName("java.lang.String");
		// 类名.class
		Class<String> strClass3 = String.class;

		System.out.println(strClass1.getName());
		System.out.println(strClass2.getName());
		System.out.println(strClass3.getName());
		System.out.println();

		// 根据类名创建新的对象
		String newStr = strClass1.getConstructor(String.class).newInstance("new String");
		System.out.println(newStr);
		System.out.println();
		System.out.println("Fields:");
		// 获取public字段
		Field[] fs = strClass1.getFields();
		for (Field f : fs) {
			System.out.println(f);
			System.out.println(f.getName());
			System.out.println(f.getType().getSimpleName());

			// 使用Modifier解析出int所对应的修饰符
			System.out.println(Modifier.toString(f.getModifiers()));
		}
		System.out.println();
		// 获取声明字段
		Field[] fs1 = strClass1.getDeclaredFields();
		for (Field f : fs1) {
			System.out.println(f);
			// 使用Modifier解析出int所对应的修饰符
			System.out.println(Modifier.toString(f.getModifiers()));
			System.out.println(f.getType().getSimpleName());
			System.out.println(f.getName().getClass().getName());
			System.out.println(f.getName());
		}
		System.out.println();
		System.out.println("Constructors:");
		Constructor[] cs = strClass1.getConstructors();

		for (Constructor<?> c : cs) {
			System.out.println(c);
		}
		System.out.println();
		System.out.println("Methods:");
		Method[] mes = strClass1.getMethods();
		for (Method m : mes) {
			System.out.println(m);
		}
		System.out.println("------------END------------");
	}
}
