package pl.itacademy.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ItAcademyStuff {
    String courseName() default "Java";

    boolean online() default true;

    int value();
}
