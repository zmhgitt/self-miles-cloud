package self.miles.test.mapsturct.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Miles
 * @ClassName User
 * @Description 类描述
 * @date 2024/7/1 15:21
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User {
    private String username;
    private String desc;
}
