package thisisnobody.exception.catchall;
/**
 * 
 * @author ZLP
 * 异常类的方法
 */
public class ExceptionMethods {

	public static void main(String[] args) throws Exception {

		try {
			throw new Exception("My Exception");
		} catch (Exception e) {

			System.out.println("Caught Exception");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
			System.out.println("==================================");
			e.printStackTrace();

		}

	}
}
