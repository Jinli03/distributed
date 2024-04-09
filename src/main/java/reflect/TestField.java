/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/3 22:12
 */
package reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class TestField {
    @Test
    public void testGetFields() throws NoSuchFieldException, IllegalAccessException {
        Class c = Cat.class;
        //所有成员变量
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());
        }
        //某个成员变量
        Field fName = c.getDeclaredField("name");
        System.out.println(fName.getName() + " " + fName.getType());

        //赋值
        Cat cat = new Cat();
        fName.setAccessible(true);
        fName.set(cat, "tom");
        System.out.println(cat);
        String name = (String) fName.get(cat);
        System.out.println(name);
    }


}
