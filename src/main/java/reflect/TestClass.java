/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/3 21:27
 */
package reflect;

public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Class对象

        //方法1
        Class c1 = Student.class;
        System.out.println(c1.getName()); //全类名
        System.out.println(c1.getSimpleName()); //简名

        //方法2
        Class c2 = Class.forName("reflect.Student");
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());

        //方法3
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3.getName());
        System.out.println(c3.getSimpleName());
    }
}
