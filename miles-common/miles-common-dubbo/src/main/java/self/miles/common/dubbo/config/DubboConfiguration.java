package self.miles.common.dubbo.config;


import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import self.miles.common.core.factory.YmlPropertySourceFactory;
import self.miles.common.dubbo.properties.DubboCustomProperties;

/**
 * dubbo 配置类
 */
@AutoConfiguration
@EnableConfigurationProperties(DubboCustomProperties.class)
@PropertySource(value = "classpath:common-dubbo.yml", factory = YmlPropertySourceFactory.class)
public class DubboConfiguration {

}
