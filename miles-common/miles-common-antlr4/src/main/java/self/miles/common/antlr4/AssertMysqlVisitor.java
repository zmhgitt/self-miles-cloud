package self.miles.common.antlr4;

import lombok.extern.slf4j.Slf4j;
import self.miles.common.antlr4.mysql.MysqlBaseVisitor;
import self.miles.common.antlr4.mysql.MysqlParser;
import self.miles.common.core.utils.RegexUtils;

import java.util.Objects;

/**
 * @ClassName MysqlVisitor
 * @Description 类描述
 * @author Miles
 * @date 2024/6/7 16:50
 */
@Slf4j
public class AssertMysqlVisitor extends MysqlBaseVisitor<String> {

    /**
     *  Table Name
     * @param ctx 上下文
     * @return
     */
    @Override
    public String visitTableName(MysqlParser.TableNameContext ctx){
        String tableName = RegexUtils.removeQuot(ctx.getText());
        log.info(tableName);
        return super.visitChildren(ctx);
    }

    /**
     *  Column Name
     * @param ctx 上下文
     * @return
     */
    @Override
    public String visitColumn_name(MysqlParser.Column_nameContext ctx) {
        String colName = RegexUtils.removeQuot(ctx.getText());
        log.info("["+colName+"]");
        return visitChildren(ctx);
    }

    /**
     *  Comment Str
     * @param ctx 上下文
     * @return
     */
    @Override
    public String visitCommonStr(MysqlParser.CommonStrContext ctx) {
        String commonStr = RegexUtils.removeQuot(ctx.getText());
        if (Objects.nonNull(commonStr)){
            log.info("'"+commonStr+"'");
        }
        return visitChildren(ctx);
    }

    @Override
    public String visitColumn_constraint(MysqlParser.Column_constraintContext ctx) {
        String cons = ctx.getText();
        if (Objects.nonNull(cons)){
            if (cons.equalsIgnoreCase("NOTNULL")){
                log.info("不为空");
            }else if (cons.equalsIgnoreCase("PRIMARYKEY")){
                log.info("主键");
            }
        }
        return visitChildren(ctx);
    }

}
