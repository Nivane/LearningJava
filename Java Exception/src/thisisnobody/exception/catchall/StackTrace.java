package thisisnobody.exception.catchall;

/**
 * 
 * 
 * @author ZLP 栈轨迹，后进先出
 */
public class StackTrace {

	public static void main(String[] args) {

		StackTrace st = new StackTrace();

		try {
			st.f();
		} catch (Exception e) {
			for (StackTraceElement ele : e.getStackTrace()) {
				System.err.println(ele.getMethodName());
			}

		}
		
		System.out.println("\n======================");

		try {
			st.g();
		} catch (Exception e) {
			for (StackTraceElement ele : e.getStackTrace()) {
				System.err.println(ele.getMethodName());

			}
		}

	}

	public void f() throws Exception {
		throw new Exception();
	}

	public void g() throws Exception {
		f();
	}

}
