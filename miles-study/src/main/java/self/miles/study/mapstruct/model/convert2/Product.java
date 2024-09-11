package self.miles.study.mapstruct.model.convert2;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Miles
 * @ClassName Product
 * @Description 类描述
 * @date 2024/7/1 17:20
 */
@Data
@NoArgsConstructor
public class Product {
    private String sku;
    private String price1;
    private String price2;
}
