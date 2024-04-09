/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/5 12:03
 */
package reflect_hom;


import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SquareFrame {

    public static void Calculate(Object obj, int length) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> c = obj.getClass();
        String cname = c.getSimpleName();
        Method cmethod = c.getDeclaredMethod("area", int.class);
        cmethod.setAccessible(true);
        double rs = (double) cmethod.invoke(obj, length);
        System.out.println(rs);
    }
}
