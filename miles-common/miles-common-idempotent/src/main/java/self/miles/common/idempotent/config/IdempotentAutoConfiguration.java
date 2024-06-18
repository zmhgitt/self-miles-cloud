package self.miles.common.idempotent.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import self.miles.common.idempotent.aspectj.RepeatSubmitAspect;
import self.miles.common.redis.config.RedisConfiguration;

/**
 * 幂等功能配置
 *
 * @author Lion Li
 */
@AutoConfiguration(after = RedisConfiguration.class)
public class IdempotentAutoConfiguration {

	@Bean
	public RepeatSubmitAspect repeatSubmitAspect() {
		return new RepeatSubmitAspect();
	}

}
