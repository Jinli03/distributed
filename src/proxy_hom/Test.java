/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/6 18:57
 */
package proxy_hom;

import java.lang.reflect.Proxy;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入被除数");
        int a = sc.nextInt();
        System.out.println("输入除数");
        int b = sc.nextInt();
        Division division = new Division();
        Calculator calProxy = ProxyUtil.createProxy(division);
        int result = calProxy.divide(a, b);
        System.out.println(result);
    }
}
