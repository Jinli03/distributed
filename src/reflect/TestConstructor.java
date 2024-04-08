/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/3 21:36
 */
package reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestConstructor {
    // 获取类的构造器
    @Test
    public void testGetConstructors() {
        Class c = Cat.class;
        //获取类的全部构造器
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "+++" + constructor.getParameterCount());
        }
    }

    @Test
    public void testGetConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = Cat.class;
        //获取类的某个构造器
        //无参构造器
        Constructor constructor1 = c.getDeclaredConstructor();
        System.out.println(constructor1.getName() + "+++" + constructor1.getParameterCount());
        constructor1.setAccessible(true); //禁止检查访问权限
        Cat cat = (Cat) constructor1.newInstance();
        System.out.println(cat);

        //有参构造器
        Constructor constructor2 = c.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor2.getName() + "+++" + constructor2.getParameterCount());
        constructor1.setAccessible(true); //禁止检查访问权限
        Cat cat2 = (Cat) constructor2.newInstance("叮当猫", 3);
        System.out.println(cat2);
    }
}
