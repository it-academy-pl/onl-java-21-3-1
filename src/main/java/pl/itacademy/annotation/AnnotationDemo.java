package pl.itacademy.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class AnnotationDemo {

    @SuppressWarnings("all")
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ClassWithDeprecatedMethod.printHello();
        doSomething(null);

        clean(() -> System.out.println("Stuff has been cleaned out!"));

        Parent p = new Parent();
        Child c = new Child();

        Class<? extends Parent> aClass = p.getClass();
        Annotation[] declaredAnnotations = aClass.getAnnotations();
        for (Annotation annotation : declaredAnnotations) {
            if (annotation instanceof ItAcademyStuff) {
                ItAcademyStuff itAnnotation = (ItAcademyStuff) annotation;
                System.out.printf("Course name: %s. Is online: %s, Student number: %d%n", itAnnotation.courseName(), itAnnotation.online(), itAnnotation.value());
            }
        }

        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            method.invoke(p, "Hello", 7);
        }

        aClass = c.getClass();
        declaredAnnotations = aClass.getAnnotations();
        for (Annotation annotation : declaredAnnotations) {
            if (annotation instanceof ItAcademyStuff) {
                ItAcademyStuff itAnnotation = (ItAcademyStuff) annotation;
                System.out.printf("Course name: %s. Is online: %s, Student number: %d%n", itAnnotation.courseName(), itAnnotation.online(), itAnnotation.value());
            }
        }


    }

    @SafeVarargs
    public static void doSomething(List<String>... arguments) {
        System.out.println(arguments);
    }

    public static void clean(Cleanable cleanable) {
        cleanable.clean();
    }
}
