/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/6 15:33
 */
package ioc;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class GlobalConfig {
    @Value("8080")
    private String port;
    @Value("/")
    private String path;
    @Autowired
    @Qualifier("config")
    private DataConfig dataConfig;
}
