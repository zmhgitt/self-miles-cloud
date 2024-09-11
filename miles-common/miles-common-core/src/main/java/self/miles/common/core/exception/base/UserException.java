package self.miles.common.core.exception.base;

import java.io.Serial;

/**
 * @author Miles
 * @ClassName UserException
 * @Description 类描述
 * @date 2024/7/1 12:02
 */
public class UserException  extends BaseException {

    @Serial
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object... args) {
        super(code, args, null);
    }
}
