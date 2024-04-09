/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/6 15:02
 */
package configuration;

import ioc.DataConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean(value = "config")
    public DataConfig dataConfig() {
        DataConfig dataConfig = new DataConfig();
        dataConfig.setDriver("Driver");
        dataConfig.setUrl("localhost:3306/db");
        dataConfig.setUsername("root");
        dataConfig.setPassword("123");
        return dataConfig;
    }
}
