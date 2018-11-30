import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity();
        Class clazz = entity.getClass();

        for (Method method: clazz.getDeclaredMethods()){
            method.setAccessible(true);
            System.out.print("Метод: " + method.getName());
            Annotation[] annotations = method.getDeclaredAnnotations();
            System.out.println(" -- Annotations: " + Arrays.toString(annotations));
        }
    }
}