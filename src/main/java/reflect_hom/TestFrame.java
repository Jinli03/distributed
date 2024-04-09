/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/5 12:12
 */
package reflect_hom;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import static reflect_hom.SquareFrame.Calculate;

public class TestFrame {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入图形");
        String shapeClassName = sc.next();
        try {
            Class<?> shapeClass = Class.forName("reflect_hom." + shapeClassName);
            Object shapeInstance = shapeClass.getDeclaredConstructor().newInstance();
            System.out.println("输入边长");
            int length = sc.nextInt();
            Calculate(shapeInstance, length);
        } catch (ClassNotFoundException | InstantiationException | IllegalArgumentException | SecurityException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
