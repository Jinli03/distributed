/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/6 16:19
 */
package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Cal bean = context.getBean(Cal.class);
        System.out.println(bean.add(2, 5));
    }
}
