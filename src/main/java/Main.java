import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity();
        Class clazz = entity.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            method.setAccessible(true);
            System.out.println("Метод: " + method.getName());
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                if (annotation != null)
                    System.out.println("\tAnnotation: " + annotation.toString());
            }
        }
    }
}