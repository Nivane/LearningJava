package thisisnobody.math.random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		Random r = new Random();
		System.out.println(r.nextInt());// ��Integer.MIN_VALUE��Integer.MAX_VALUE
		System.out.println(r.nextInt(10));// ������ߣ������ұߣ�{0,1,2,3,4,5,6,7,8,9}
		System.out.println(r.nextDouble());// ��0.0��1.0
		System.out.println(r.nextBoolean());

		// Math.random()������random.nextDouble()����0.0��1.0֮�������double��ֵ
		System.out.println((int) (Math.random() * 10));

		// [3,7]
		System.out.println(r.nextInt(5) + 3);
		System.out.println((int) (Math.random() * 5) + 3);
	}
}
