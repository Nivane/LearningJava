package thisisnobody.exception.badfinally;

/**
 * 
 * @author ZLP finally中的return导致所有异常信息无法输出
 */
public class AllSilencer {

	@SuppressWarnings("finally")
	public static void main(String[] args) {

//		throw new RuntimeException();  //输出异常信息
		try {
			throw new RuntimeException();
		} finally {
			return;//导致异常信息未输出
		}
	}
}
