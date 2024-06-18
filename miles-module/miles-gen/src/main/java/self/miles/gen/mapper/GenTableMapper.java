package self.miles.gen.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import self.miles.gen.model.GenTable;
import self.miles.gen.model.GenTableColumn;

import java.util.List;

/**
 * @ClassName: GenTableMapper
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/11 17:15
 */
public interface GenTableMapper extends BaseMapper<GenTable> {

    /**
     * 查询表信息
     * @return
     */
    GenTable selectDbTableListByNames(@Param("tableName") String tableName);

    /**
     * 查询表列信息
     * @return
     */
    List<GenTableColumn> selectDbTableColumnsByName(@Param("tableName") String tableName);

}
