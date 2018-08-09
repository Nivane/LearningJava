package thisisnobody.exception.custom;

public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {
	}

	public MyException(String message) {
		//调用基类构造器，接受一个字符串类型参数
		super(message);
	}
}
