package thisisnobody.annotation.basic;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
	public int id();

	public String description() default "no description"; //未赋值则使用默认值no description
}
