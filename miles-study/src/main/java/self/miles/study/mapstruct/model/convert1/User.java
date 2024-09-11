package self.miles.study.mapstruct.model.convert1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Miles
 * @ClassName User
 * @Description 类描述
 * @date 2024/7/1 16:19
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User {
    private String username;

    private String desc;
}
