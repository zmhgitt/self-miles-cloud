package self.miles.common.mybatis.core.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serial;

/**
 * @ClassName: TenantEntity
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/6/5 16:25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class TenantEntity extends BaseEntity{

    /**
     * 租户编号
     */
    private String tenantId;
}
