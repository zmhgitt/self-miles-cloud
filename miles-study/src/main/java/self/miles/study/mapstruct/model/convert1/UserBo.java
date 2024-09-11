package self.miles.study.mapstruct.model.convert1;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Miles
 * @ClassName UserBo
 * @Description 类描述
 * @date 2024/7/1 16:24
 */
@Data
@AllArgsConstructor
@AutoMapper(target = User.class,reverseConvertGenerate = false)
public class UserBo {
    private String username;
    private String desc;
}
