package thisisnobody.exception.custom;

public class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {
	}

	public MyException(String message) {
		//���û��๹����������һ���ַ������Ͳ���
		super(message);
	}
}
