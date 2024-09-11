package self.miles.study.mapstruct.model.convert3;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;


/**
 * @author Miles
 * @ClassName EstimateBo
 * @Description 类描述
 * @date 2024/7/2 9:24
 */
@Data
@AllArgsConstructor
@AutoMapper(target = Estimate.class,uses = Sales2FieldConvert.class)
public class EstimateBo {
    private Integer month;
    private Sales sales;
}
