package self.miles.common.core.utils;

import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RegExUtils;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: RegexUtils
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/6/7 17:22
 */
@NoArgsConstructor
public class RegexUtils extends RegExUtils {

    /**
     * 应用于字符串去掉逗号引号等
     * @param str 指定匹配字符
     * @return  返回第一个匹配的字符串
     */
    public static String removeQuot(String str){
        return removeAll(str,"\"|'|`");
    }
    /**
     *  匹配指定字符串，返回Matcher对象
     *     获取Matcher对象后
     *     while(Matcher.find()){ Matcher.group() }
     * @param regex 正则表达式
     * @param str 匹配字符
     * @return Matcher对象
     */
    public static Matcher toPatterStr(String regex,String str){
        return Pattern.compile(regex).matcher(str);
    }
}
