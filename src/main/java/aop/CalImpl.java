/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/6 15:43
 */
package aop;

import org.springframework.stereotype.Component;

@Component
public class CalImpl implements Cal{

    @Override
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    @Override
    public int mul(int a, int b) {
        int result = a * b;
        return result;
    }

    @Override
    public int div(int a, int b) {
        int result = a / b;
        return result;
    }
}
