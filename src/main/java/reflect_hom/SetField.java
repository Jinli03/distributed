/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/5 11:14
 */
package reflect_hom;

import org.junit.Test;

import java.lang.reflect.Field;

public class SetField {

    @Test
    public void setField() throws NoSuchFieldException, IllegalAccessException {
        Student stu = new Student();
        Field name = Student.class.getDeclaredField("name");
        System.out.println(name.getName() + " " + name.getType());
        name.setAccessible(true);
        name.set(stu, "李明");
        String value = (String) name.get(stu);
        System.out.println(value);
    }


}
