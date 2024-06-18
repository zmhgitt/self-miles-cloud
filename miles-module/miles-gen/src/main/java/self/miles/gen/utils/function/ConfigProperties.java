package self.miles.gen.utils.function;

/**
 * @ClassName: ConfigProperties
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/13 16:39
 */
@FunctionalInterface
public interface ConfigProperties<T> {

    /**
     * 主要是可以让外部进行额外配置
     * @param t
     */
    void set(T t);
}
