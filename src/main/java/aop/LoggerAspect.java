/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/6 15:57
 */
package aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

@Component
@Aspect
public class LoggerAspect {
    @Before("execution(public int aop.CalImpl.*(..))")
    public void before(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法的参数是" + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(value = "execution(public int aop.CalImpl.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法的结果是" + result);
    }

}
