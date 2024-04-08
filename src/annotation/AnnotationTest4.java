/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/4 17:21
 */
package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest4 {
    @MyTest
    public void test1() {
        System.out.println("1");
    }
    public void test2() {
        System.out.println("2");
    }
    @MyTest
    public void test3() {
        System.out.println("3");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        AnnotationTest4 a = new AnnotationTest4();
        Class c = AnnotationTest4.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(a);
            }
        }
    }
}
