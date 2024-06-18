package self.miles.common.core.utils;

import cn.hutool.core.date.DateUtil;

import java.util.Date;

/**
 * @ClassName: DateUtils
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/31 10:55
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    /**
     * 获取当前时间
     * @return 当前时间
     */
    public static Date dateNow(){
        return new Date();
    }
}
