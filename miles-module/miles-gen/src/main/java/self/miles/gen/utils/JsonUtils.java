package self.miles.gen.utils;

import cn.hutool.core.lang.Dict;
import com.alibaba.fastjson.JSONObject;
import self.miles.common.core.utils.StringUtils;

/**
 * @ClassName: JsonUtils
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/11 18:02
 */
public class JsonUtils {

    public static Dict parseMap(String text) {
        if (StringUtils.isBlank(text)) {
            return null;
        }
        return JSONObject.parseObject(text,Dict.class);
    }

}
