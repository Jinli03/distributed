/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/5 21:56
 */
package reflect_hom;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import static reflect_hom.ProFrame.Programe;

public class TestProFrame {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入类名");
        String proClassName = sc.next();
        Class<?> proClass = Class.forName("reflect_hom." + proClassName);
        Object proInstance = proClass.getDeclaredConstructor().newInstance();
        System.out.println("输入属性名或方法名");
        String or = sc.next();
        System.out.println("输入要赋的值");
        String price = sc.next();
        Programe(proInstance, or, price);
    }
}
