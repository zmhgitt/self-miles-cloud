package self.miles.common.json.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * @author Miles
 * @ClassName JsonUtils
 * @Description 类描述
 * @date 2024/6/26 16:57
 */
public class JsonUtils {

    public static String toJSONString(Object object){
        return JSONObject.toJSONString(object);
    }
}
