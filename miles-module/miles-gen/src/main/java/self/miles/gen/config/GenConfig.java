package self.miles.gen.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: GenConfig
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/11 17:38
 */
@Component
@ConfigurationProperties(prefix = "gen")
public class GenConfig {
    /**
     * 作者
     */
    public static String author;

    /**
     * 生成包路径
     */
    public static String packageName;

    /**
     * 自动去除表前缀，默认是false
     */
    public static boolean autoRemovePre;

    /**
     * 表前缀(类名不会包含表前缀)
     */
    public static String tablePrefix;

    /**
     * 菜单父级ID
     */
    public static String parentMenuId;

    /**
     * 生成的绝对路径
     */
    public static String absolutePath;

    public static String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        GenConfig.author = author;
    }

    public static String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        GenConfig.packageName = packageName;
    }

    public static boolean getAutoRemovePre() {
        return autoRemovePre;
    }

    public void setAutoRemovePre(boolean autoRemovePre) {
        GenConfig.autoRemovePre = autoRemovePre;
    }

    public static String getTablePrefix() {
        return tablePrefix;
    }

    public void setTablePrefix(String tablePrefix) {
        GenConfig.tablePrefix = tablePrefix;
    }

    public static String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        GenConfig.parentMenuId = parentMenuId;
    }

    public static String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        GenConfig.absolutePath = absolutePath;
    }
}
