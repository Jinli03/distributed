/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/5 11:38
 */
package reflect_hom;

public class Meth {
    public static String StaticMethod() {
        System.out.println("调用了静态方法");
        return "静态方法返回值";
    }

    private String PrivateMethod() {
        System.out.println("调用了私有方法");
        return "私有方法返回值";
    }
}

