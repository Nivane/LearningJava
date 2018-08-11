package thisisnobody.annotation.basic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
	public static void trackUseCases(List<Integer> useCases, Class<?> cl) {

		for (Method m : cl.getDeclaredMethods()) {

			UseCase uc = m.getAnnotation(UseCase.class);
			if (uc != null) {
				System.out.println("Found use case�� " + uc.id() + " " + uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}

	}

	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<>();
		Collections.addAll(useCases, 47, 48, 49, 50);
		trackUseCases(useCases, PasswordUtils.class);

	}
}
