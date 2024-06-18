package self.miles.common.core.enums;

import lombok.*;
import self.miles.common.core.utils.StringUtils;

/**
 * @ClassName: UserType
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/6/5 15:47
 */
@Getter
@AllArgsConstructor
public enum UserType {
    /**
     * pc端
     */
    SYS_USER("sys_user"),

    /**
     * app端
     */
    APP_USER("app_user");

    private final String userType;

    public static UserType getUserType(String str) {
        for (UserType value : values()) {
            if (StringUtils.contains(str, value.getUserType())) {
                return value;
            }
        }
        throw new RuntimeException("'UserType' not found By " + str);
    }
}
