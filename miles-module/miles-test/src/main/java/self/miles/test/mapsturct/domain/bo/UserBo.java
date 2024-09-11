package self.miles.test.mapsturct.domain.bo;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import self.miles.test.mapsturct.domain.User;

/**
 * @author Miles
 * @ClassName UserBo
 * @Description 类描述
 * @date 2024/7/1 15:23
 */
@Data
@AutoMapper(target = User.class,reverseConvertGenerate = false)
public class UserBo {
    private String username;
    private String desc;
}
