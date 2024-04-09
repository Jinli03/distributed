/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/3 22:59
 */
package reflect;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMethod {
    @Test
    public void testGetMethods() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class c = Cat.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + method.getParameterCount() + method.getReturnType());
        }
        Method run = c.getDeclaredMethod("run");
        System.out.println(run.getName() + run.getParameterCount() + run.getReturnType());
        Method eat = c.getDeclaredMethod("eat", String.class);
        System.out.println(eat.getName() + eat.getParameterCount() + eat.getReturnType());

        //触发方法执行
        Cat cat = new Cat();
        run.setAccessible(true);
        Object rs = run.invoke(cat);
        System.out.println(rs);
        eat.setAccessible(true);
        String an = (String) eat.invoke(cat, "馒头");
        System.out.println(an);
    }
}
