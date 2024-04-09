/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/7 15:23
 */
package aop_hom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("vehicle.xml");
        TollGate tollGate = context.getBean(TollGate.class);
        tollGate.charge();
    }
}
