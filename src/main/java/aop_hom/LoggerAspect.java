/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/7 15:11
 */
package aop_hom;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Before("execution(* aop_hom.TollGate.charge())")
    public void logBefore() {
        System.out.println("欢迎光临收费站，开始计费...");
    }

    @AfterReturning("execution(* aop_hom.TollGate.charge())")
    public void logAfter() {
        System.out.println("谢谢，祝旅途顺利！");
    }
}
