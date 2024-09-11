package self.miles.sys;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

/**
 * @ClassName: SelfSystemApplication
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/6/4 17:15
 */
@EnableDubbo
@SpringBootApplication
public class SelfSystemApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SelfSystemApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  ");
        System.out.println("Quick Start: http://localhost:9900");
        System.out.println("(♥◠‿◠)ﾉﾞ  -------------   ლ(´ڡ`ლ)ﾞ  ");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
    }

    @Pointcut
    public void SpringDocAutoConfiguration(){
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
    }
}
