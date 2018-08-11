package thisisnobody.annotation.basic;

public class PasswordUtils {

	@UseCase(id = 1)
	public boolean validatePassword(String password) {
		return true;
	}

	@UseCase(id = 1, description = "hello")
	public String enPassword(String password) {
		return "password";
	}

}
