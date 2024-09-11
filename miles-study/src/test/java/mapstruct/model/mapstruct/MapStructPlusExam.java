package mapstruct.model.mapstruct;

import io.github.linpeilie.Converter;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import self.miles.study.SelfStudyApplication;
import self.miles.study.mapstruct.model.convert1.User;
import self.miles.study.mapstruct.model.convert1.UserBo;
import self.miles.study.mapstruct.model.convert2.Product;
import self.miles.study.mapstruct.model.convert2.ProductBo;
import self.miles.study.mapstruct.model.convert3.Estimate;
import self.miles.study.mapstruct.model.convert3.EstimateBo;
import self.miles.study.mapstruct.model.convert3.Sales;

import java.math.BigDecimal;

/**
 * @author Miles
 * @ClassName MapStructPlusExam
 * @Description 类描述
 * @date 2024/7/1 16:26
 */
@SpringBootTest(classes = SelfStudyApplication.class)
public class MapStructPlusExam {

    @Autowired
    private Converter converter;

    @Test
    public void convert1(){
        UserBo userBo = new UserBo("张三", "谁是张三");
        User user = converter.convert(userBo, User.class);
        System.out.println("名字是："+user.getUsername());
    }

    /**
     * 多属性对单属性 转换
     */
    @Test
    public void convert2(){
        ProductBo productBo = new ProductBo("xxxxxxa-100000001", "100,%s");
        Product product = converter.convert(productBo, Product.class);
        System.out.println("成本价："+product.getPrice1()+Strings.LINE_SEPARATOR+"销售价："+product.getPrice2());
    }

    /**
     * 类型 转换
     */
    @Test
    public void convert3(){
        EstimateBo estimateBo = new EstimateBo(1,new Sales(100000d));
        Estimate estimate = converter.convert(estimateBo, Estimate.class);
        System.out.println(estimate.getSales().doubleValue());
    }

//    /**
//     * 类型 转换(反向)
//     */
//    @Test
//    public void convert3_1(){
//        Estimate estimate = new Estimate(1,new BigDecimal("0"),100d);
//        EstimateBo estimateBo = converter.convert(estimate, EstimateBo.class);
//        System.out.println(estimateBo.getSales().doubleValue());
//        System.out.println(estimateBo.getProfits().doubleValue());
//    }


    public static void main(String[] args) {

    }
}
