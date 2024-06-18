package self.miles.common.mybatis.config;

import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import self.miles.common.core.factory.YmlPropertySourceFactory;

/**
 * @ClassName: MybatisPlusConfiguration
 * @Description:
 * @author: Miles
 * @date: 2024/6/4 17:17
 */
@EnableTransactionManagement(proxyTargetClass = true)
@AutoConfiguration(before = MybatisPlusAutoConfiguration.class)
@MapperScan("${mybatis-plus.mapper-package}")
@PropertySource(value = "classpath:common-mybatis.yml", factory = YmlPropertySourceFactory.class)
public class MybatisPlusConfiguration {
}
