/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/4 19:49
 */
package proxy;

public class Test {
    public static void main(String[] args) {
        BigStar s = new BigStar("杨超越");
        Star starProxy = ProxyUtil.createProxy(s);
        String rs = starProxy.sing("好日子");
        System.out.println(rs);
    }
}
