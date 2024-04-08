/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/4 16:39
 */
package annotation;

import org.junit.Test;

import java.lang.reflect.Method;

public class AnnotationTest3 {
    @Test
    public void parseClass() {
        Class c = Demo.class;
        if (c.isAnnotationPresent(MyTest3.class)){
            MyTest3 myTest3 = (MyTest3) c.getDeclaredAnnotation(MyTest3.class);
            System.out.println(myTest3.value());
        }
    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        Class c = Demo.class;
        Method m = c.getDeclaredMethod("test1");
        if (m.isAnnotationPresent(MyTest3.class)){
            MyTest3 myTest3 = (MyTest3) m.getDeclaredAnnotation(MyTest3.class);
            System.out.println(myTest3.value());
        }
    }
}
