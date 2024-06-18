package self.miles.common.antlr4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import self.miles.common.antlr4.mysql.MysqlLexer;
import self.miles.common.antlr4.mysql.MysqlParser;

/**
 * @ClassName: Test
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/23 10:56
 */
public class Test {

    public static void main(String[] args) {
        String sql= "create table if not exists `jwxl_supervision_form`(\n" +
                "    form_id int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '编号',\n" +
                "    operator_id int(11) unsigned NOT NULL comment '督办经办人',\n" +
                "    do_date datetime NOT NULL comment '督办时间',\n" +
                "    department_id int(11) unsigned NOT NULL comment '被督办单位',\n" +
                "    reason varchar(255) comment '被督办原因',\n" +
                "    requirement varchar(255) comment '督办要求',\n" +
                "    res_leader_id int(11) comment '责任领导',\n" +
                "    result_msg varchar(255) comment '督办结果反馈',\n" +
                "    remarks varchar(255) comment '备注',\n" +
                "    reviewer_id int(11) unsigned NOT NULL comment '督办审批人',\n" +
                "    review_status tinyint(4) default 0 comment '审核状态:0未审核1审核通过2审核不通过3作废',\n" +
                "    review_time datetime comment '审核时间',\n" +
                "    update_time datetime comment '更新时间',\n" +
                "    primary key (`form_id`)\n" +
                ")";
        CharStream stream = CharStreams.fromString(sql);
        MysqlLexer lexer = new MysqlLexer(stream);  //词法分析

        CommonTokenStream tokens = new CommonTokenStream(lexer);  //转成token流
        MysqlParser parser = new MysqlParser(tokens); // 语法分析

        MysqlParser.ParseContext context = parser.parse();  //获取某一个规则树，这里获取的是最外层的规则，也可以通过sql()获取sql规则树......
//        System.out.println(context.toStringTree(parser)); //打印规则数

        //实现类（可以验证token，并让其产生相应的作用）（或创建生命周期函数（Listen））
        AssertMysqlVisitor visitor = new AssertMysqlVisitor();
        String s = visitor.visitParse(context);
//        System.out.println(s);
    }
}
