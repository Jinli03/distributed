/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/5 21:43
 */
package reflect_hom;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ProFrame {

    public static void Programe(Object obj, String key, String value) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, NoSuchFieldException {
        Class<?> c = obj.getClass();
        String cname = c.getSimpleName();
        try {
            Field cfield = c.getDeclaredField(key);
            cfield.setAccessible(true);
            if (cfield != null) {
                System.out.println("Field exists: " + cfield.getName());
                cfield.setAccessible(true);
                cfield.set(obj, value);
                System.out.println("Set value: " + cfield.get(obj));
            } else {
                System.out.println("Field does not exist");
            }
        } catch (NoSuchFieldException e) {
            System.out.println("Field does not exist");
        }

        try {
            Method cmethod = c.getDeclaredMethod(key, String.class);
            cmethod.setAccessible(true);
            if (cmethod != null) {
                System.out.println("Method exists: " + cmethod.getName());
                String rs = (String) cmethod.invoke(obj, value);
                System.out.println("Method result: " + rs);
            } else {
                System.out.println("Method does not exist");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method does not exist");
        }
    }



}
