package thisisnobody.math.random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {

		Random r = new Random();
		System.out.println(r.nextInt());// 从Integer.MIN_VALUE到Integer.MAX_VALUE
		System.out.println(r.nextInt(10));// 包含左边，不含右边，{0,1,2,3,4,5,6,7,8,9}
		System.out.println(r.nextDouble());// 从0.0到1.0
		System.out.println(r.nextBoolean());

		// Math.random()调用了random.nextDouble()产生0.0到1.0之间的任意double数值
		System.out.println((int) (Math.random() * 10));

		// [3,7]
		System.out.println(r.nextInt(5) + 3);
		System.out.println((int) (Math.random() * 5) + 3);
	}
}
