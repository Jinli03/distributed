/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/4 0:11
 */
package reflect;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjectFrame {
    public static void saveObject(Object obj) throws FileNotFoundException, IllegalAccessException {
        PrintStream ps = new PrintStream(new FileOutputStream("D:\\tomcat\\distributed\\src\\data.txt", true));
        Class c = obj.getClass();
        String cname = c.getSimpleName();
        ps.println("-----" + cname + "-----");
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            field.setAccessible(true);
            String value = field.get(obj) + "";
            ps.println(name + "=" + value);
        }
        ps.close();
    }
}
