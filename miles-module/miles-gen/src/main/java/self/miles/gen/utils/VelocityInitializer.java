package self.miles.gen.utils;

import org.apache.velocity.app.Velocity;

import java.util.Properties;

/**
 * @ClassName: VelocityInitializer
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/11 17:45
 */
public class VelocityInitializer {

    /**
     * 初始化vm方法
     */
    public static void initVelocity() {
        Properties p = new Properties();
        try {
            // 加载classpath目录下的vm文件
            p.setProperty("resource.loader.file.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
            // 定义字符集
            p.setProperty(Velocity.INPUT_ENCODING,"UTF-8");
            // 初始化Velocity引擎，指定配置Properties
            Velocity.init(p);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
