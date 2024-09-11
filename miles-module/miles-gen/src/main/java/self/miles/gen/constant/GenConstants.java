package self.miles.gen.constant;

/**
 * @ClassName: GenConstants
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/11 17:48
 */
public class GenConstants {

    /**
     * 单表（增删改查）
     */
    public static String TPL_CRUD = "crud";

    /**
     * 树表（增删改查）
     */
    public static String TPL_TREE = "tree";

    /**
     * 树编码字段
     */
    public static String TREE_CODE = "treeCode";

    /**
     * 树父编码字段
     */
    public static String TREE_PARENT_CODE = "treeParentCode";

    /**
     * 树名称字段
     */
    public static String TREE_NAME = "treeName";

    /**
     * 上级菜单ID字段
     */
    public static String PARENT_MENU_ID = "parentMenuId";

    /**
     * 上级菜单名称字段
     */
    public static String PARENT_MENU_NAME = "parentMenuName";

    /**
     * 数据库字符串类型
     */
    public static String[] COLUMNTYPE_STR = {"char", "varchar", "enum", "set", "nchar", "nvarchar", "varchar2", "nvarchar2"};

    /**
     * 数据库文本类型
     */
    public static String[] COLUMNTYPE_TEXT = {"tinytext", "text", "mediumtext", "longtext", "binary", "varbinary", "blob",
            "ntext", "image", "bytea"};

    /**
     * 数据库时间类型
     */
    public static String[] COLUMNTYPE_TIME = {"datetime", "time", "date", "timestamp", "year", "interval",
            "smalldatetime", "datetime2", "datetimeoffset"};

    /**
     * 数据库数字类型
     */
    public static String[] COLUMNTYPE_NUMBER = {"tinyint", "smallint", "mediumint", "int", "number", "integer",
            "bit", "bigint", "float", "double", "decimal", "numeric", "real", "double precision",
            "smallserial", "serial", "bigserial", "money", "smallmoney"};

    /**
     * BO对象 不需要添加字段
     */
    public static String[] COLUMNNAME_NOT_ADD = {"create_dept", "create_by", "create_time", "del_flag", "update_by",
            "update_time", "version", "tenant_id"};

    /**
     * BO对象 不需要编辑字段
     */
    public static String[] COLUMNNAME_NOT_EDIT = {"create_dept", "create_by", "create_time", "del_flag", "update_by",
            "update_time", "version", "tenant_id"};

    /**
     * VO对象 不需要返回字段
     */
    public static String[] COLUMNNAME_NOT_LIST = {"create_dept", "create_by", "create_time", "del_flag", "update_by",
            "update_time", "version", "tenant_id"};

    /**
     * BO对象 不需要查询字段
     */
    public static String[] COLUMNNAME_NOT_QUERY = {"id", "create_dept", "create_by", "create_time", "del_flag", "update_by",
            "update_time", "remark", "version", "tenant_id"};

    /**
     * Entity基类字段
     */
    public static String[] BASE_ENTITY = {"createDept", "createBy", "createTime", "updateBy", "updateTime", "tenantId"};

    /**
     * 文本框
     */
    public static String HTML_INPUT = "input";

    /**
     * 文本域
     */
    public static String HTML_TEXTAREA = "textarea";

    /**
     * 下拉框
     */
    public static String HTML_SELECT = "select";

    /**
     * 单选框
     */
    public static String HTML_RADIO = "radio";

    /**
     * 复选框
     */
    public static String HTML_CHECKBOX = "checkbox";

    /**
     * 日期控件
     */
    public static String HTML_DATETIME = "datetime";

    /**
     * 图片上传控件
     */
    public static String HTML_IMAGE_UPLOAD = "imageUpload";

    /**
     * 文件上传控件
     */
    public static String HTML_FILE_UPLOAD = "fileUpload";

    /**
     * 富文本控件
     */
    public static String HTML_EDITOR = "editor";

    /**
     * 字符串类型
     */
    public static String TYPE_STRING = "String";

    /**
     * 整型
     */
    public static String TYPE_INTEGER = "Integer";

    /**
     * 长整型
     */
    public static String TYPE_LONG = "Long";

    /**
     * 浮点型
     */
    public static String TYPE_DOUBLE = "Double";

    /**
     * 高精度计算类型
     */
    public static String TYPE_BIGDECIMAL = "BigDecimal";

    /**
     * 时间类型
     */
    public static String TYPE_DATE = "Date";

    /**
     * 模糊查询
     */
    public static String QUERY_LIKE = "LIKE";

    /**
     * 相等查询
     */
    public static String QUERY_EQ = "EQ";

    /**
     * 需要
     */
    public static String REQUIRE = "1";

    /**
     * GenTable  sys 属性值
     */
    public static String SYS_ARES = "ares";
    /**
     * GenTable  sys 属性值
     */
    public static String SYS_SELF = "self";
}
