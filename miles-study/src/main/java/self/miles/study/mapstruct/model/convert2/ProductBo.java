package self.miles.study.mapstruct.model.convert2;

import io.github.linpeilie.annotations.AutoMapper;
import io.github.linpeilie.annotations.AutoMapping;
import io.github.linpeilie.annotations.AutoMappings;
import lombok.AllArgsConstructor;
import lombok.Data;
import self.miles.study.mapstruct.model.convert2.imports.PriceDestroyer;


/**
 * @author Miles
 * @ClassName ProductBo
 * @Description 类描述
 * @date 2024/7/1 17:21
 */
@Data
@AllArgsConstructor
@AutoMapper(target = Product.class,imports = PriceDestroyer.class,reverseConvertGenerate = false)
public class ProductBo {
    private String sku;
    @AutoMappings(
       {
          @AutoMapping(source = "price",target = "price1",expression = "java(source.getPrice().split(\",\")[0])"),
          @AutoMapping(source = "price",target = "price2",expression = "java(source.getPrice().split(\",\")[1].formatted(PriceDestroyer.price))")
       }
    )
    private String price;


}
