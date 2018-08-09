package thisisnobody.exception.custom;

/**
 * 
 * @author ZLP
 * 常用的异常构造器参数
 */

public class FullConstructors extends MyException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void f() throws MyException {
		System.out.println("MyException from f()");
		throw new MyException();
	}

	public void g() throws MyException {
		System.out.println("MyException from g()");
		throw new MyException("Im from g()!");
	}

	public static void main(String[] args) {
		FullConstructors fc = new FullConstructors();
		try {
			fc.f();
		} catch (MyException e) {
			e.printStackTrace();
		}

		try {
			fc.g();
		} catch (MyException e) {
			e.printStackTrace();

		}

	}

}
