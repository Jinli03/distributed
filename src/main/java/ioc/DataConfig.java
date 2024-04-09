/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/6 14:07
 */
package ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("config")
public class DataConfig {
    @Value("localhost:3306")
    private String url;
    @Value("Driver")
    private String driver;
    @Value("root")
    private String username;
    @Value("123")
    private String password;

}
