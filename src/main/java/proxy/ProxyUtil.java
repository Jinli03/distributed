/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/4 19:39
 */
package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star createProxy(BigStar bigStar) {
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if(method.getName().equals("sing")) {
                            System.out.println("准备话筒");
                        }else if (method.getName().equals("dance")) {
                            System.out.println("准备场地");
                        }
                        return method.invoke(bigStar, args);
                    }
                });
        return starProxy;
    }
}
