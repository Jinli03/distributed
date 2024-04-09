/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/6 14:12
 */
package ioc;

import configuration.BeanConfiguration;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        DataConfig dataConfig = new DataConfig();
//        dataConfig.setDriver("Driver");
//        dataConfig.setUrl("localhost:3306/db");
//        dataConfig.setUsername("root");
//        dataConfig.setPassword("123");

        //xml
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        System.out.println(context.getBean("config"));
        //configuration
//        ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class); //类名
//        ApplicationContext context = new AnnotationConfigApplicationContext("configuration"); //扫包
//        System.out.println(context.getBean(DataConfig.class));
//        System.out.println(context.getBean("config")); //默认方法名
        //扫包+注解
        ApplicationContext context = new AnnotationConfigApplicationContext("ioc");
        System.out.println(context.getBean(DataConfig.class));
        System.out.println(context.getBean(GlobalConfig.class));

    }
}
