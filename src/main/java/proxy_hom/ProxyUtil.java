/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/6 19:06
 */
package proxy_hom;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class ProxyUtil {

    public static  Calculator createProxy(Division division) {
        Calculator calProxy = (Calculator) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Calculator.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if(method.getName().equals("divide")) {
                            int a = (int) args[0];
                            int b = (int) args[1];
                            if (b == 0) {
                                System.out.println("除数不能为0");
                                return -9999;
                            }
                            if (a % b != 0) {
                                System.out.println("余数为" + (a % b) );
                            }
                        }
                        return method.invoke(division, args);
                    }
                });
        return calProxy;
    }

}
