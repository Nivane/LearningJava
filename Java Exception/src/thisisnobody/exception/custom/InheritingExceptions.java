package thisisnobody.exception.custom;
/**
 * 
 * @author ZLP
 * 自定义异常必须继承已有的异常类
 *
 */
public class InheritingExceptions extends SimpleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void f() throws SimpleException {
		System.out.println("SimpleException from f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {

		InheritingExceptions ie = new InheritingExceptions();
		try {
			ie.f();
		} catch (SimpleException se) {
			System.err.println("Caught It! ");
			se.printStackTrace();
		}

	}

}
