package self.miles.common.web.core.controller;

import self.miles.common.core.domain.R;

/**
 * @ClassName: BaseController
 * @Description:
 * @author: Miles
 * @date: 2024/5/31 14:15
 */
public class BaseController {

    /**
     * 响应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    protected R<Void> toAjax(int rows) {
        return rows > 0 ? R.ok() : R.fail();
    }

    /**
     * 响应返回结果
     *
     * @param result 结果
     * @return 操作结果
     */
    protected R<Void> toAjax(boolean result) {
        return result ? R.ok() : R.fail();
    }
}
