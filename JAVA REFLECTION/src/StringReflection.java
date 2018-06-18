import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 
 * @author ZLP 2018.06.18 ʹ�÷������ ������������ʱ������ʼ���޸�����ṹ��״̬������
 * 
 */
public class StringReflection {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) throws Exception {
		String str = "hello world";
		/*
		 * ��ȡ����������ַ���
		 */
		// �������getClass()
		Class<? extends String> strClass1 = str.getClass();
		// Class.forName()
		Class<?> strClass2 = Class.forName("java.lang.String");
		// ����.class
		Class<String> strClass3 = String.class;

		System.out.println(strClass1.getName());
		System.out.println(strClass2.getName());
		System.out.println(strClass3.getName());
		System.out.println();

		// �������������µĶ���
		String newStr = strClass1.getConstructor(String.class).newInstance("new String");
		System.out.println(newStr);
		System.out.println();
		System.out.println("Fields:");
		// ��ȡpublic�ֶ�
		Field[] fs = strClass1.getFields();
		for (Field f : fs) {
			System.out.println(f);
			System.out.println(f.getName());
			System.out.println(f.getType().getSimpleName());

			// ʹ��Modifier������int����Ӧ�����η�
			System.out.println(Modifier.toString(f.getModifiers()));
		}
		System.out.println();
		// ��ȡ�����ֶ�
		Field[] fs1 = strClass1.getDeclaredFields();
		for (Field f : fs1) {
			System.out.println(f);
			// ʹ��Modifier������int����Ӧ�����η�
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
