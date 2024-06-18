package self.miles.gen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.context.annotation.PropertySource;
import self.miles.common.core.factory.YmlPropertySourceFactory;

/**
 * @ClassName: SelfGenApplication
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/31 14:31
 */
@SpringBootApplication
public class SelfGenApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SelfGenApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
    }
}
