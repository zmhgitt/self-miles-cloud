package self.miles.study.mapstruct.model.convert3;

import io.github.linpeilie.annotations.AutoMapping;
import io.github.linpeilie.annotations.AutoMappings;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author Miles
 * @ClassName Double2BigDecimalConvert
 * @Description 类描述
 * @date 2024/7/2 9:28
 */
@Component
public class Sales2FieldConvert {

    public BigDecimal Sales2Field(Sales sales){
        return BigDecimal.valueOf(sales.getSales());//未判空
    }

    public Sales Sales2Field(BigDecimal sales){
        return new Sales(sales.doubleValue());//未判空
    }
}
