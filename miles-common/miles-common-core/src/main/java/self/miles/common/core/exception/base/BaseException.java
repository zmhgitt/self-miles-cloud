package self.miles.common.core.exception.base;

import lombok.*;
import self.miles.common.core.utils.MessageUtils;
import self.miles.common.core.utils.StringUtils;

import java.io.Serial;

/**
 * @ClassName: BaseException
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/31 11:06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class BaseException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误码对应的参数
     */
    private Object[] args;

    /**
     * 错误消息
     */
    private String message;

    @Override
    public String getMessage() {
        String message = null;
        if (!StringUtils.isEmpty(code)) {
            message = MessageUtils.message(code, args);
        }
        return message;
    }
}
