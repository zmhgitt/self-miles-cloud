package self.miles.study.mapstruct.model.convert3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author Miles
 * @ClassName Estimate
 * @Description 类描述
 * @date 2024/7/2 9:18
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Estimate {

    private Integer month;
    private BigDecimal sales;
}
