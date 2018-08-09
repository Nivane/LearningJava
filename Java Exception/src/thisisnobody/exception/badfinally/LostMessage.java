package thisisnobody.exception.badfinally;
/**
 * 
 * @author ZLP
 * 导致信息缺失的exception实现
 */
public class LostMessage {

	public static void f() throws MostImportantException {
		throw new MostImportantException();
	}

	public static void g() throws VeryImportantException {
		throw new VeryImportantException();
	}

	public static void main(String[] args) {
		try {
			try {
				f();
			} finally {
				g(); //覆蓋了mostimportantexception，是個缺陷
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

class VeryImportantException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "A very important Exception";
	}

}

class MostImportantException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "A most important Exception";
	}

}