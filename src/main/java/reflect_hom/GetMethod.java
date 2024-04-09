/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/5 11:45
 */
package reflect_hom;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethod {

    @Test
    public void testGetMethods() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class meth = Meth.class;
        Method staticMethod = meth.getMethod("StaticMethod");
        Object rs = staticMethod.invoke(null);
        System.out.println(rs);

        Method privateMethod = meth.getDeclaredMethod("PrivateMethod");
        Meth pri = new Meth();
        privateMethod.setAccessible(true);
        Object rs1 = privateMethod.invoke(pri);
        System.out.println(rs1);
    }

}
