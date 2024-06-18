package self.miles.common.core.exception.base;

import lombok.*;

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
     * 错误消息
     */
    private String message;


}
