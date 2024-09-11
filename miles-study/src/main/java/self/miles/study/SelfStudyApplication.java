package self.miles.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

/**
 * @author Miles
 * @ClassName SelfStudyApplication
 * @Description 类描述
 * @date 2024/7/1 16:17
 */
@SpringBootApplication
public class SelfStudyApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SelfStudyApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
    }
}
