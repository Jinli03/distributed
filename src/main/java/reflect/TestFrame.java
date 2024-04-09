/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/4 0:23
 */
package reflect;

import org.junit.Test;

import java.io.FileNotFoundException;

public class TestFrame {
    @Test
    public void save() throws FileNotFoundException, IllegalAccessException {
        Student s1 = new Student("董岩", 15);
        Teacher s2 = new Teacher("枫花恋", 6000);
        ObjectFrame.saveObject(s1);
        ObjectFrame.saveObject(s2);
    }
}
