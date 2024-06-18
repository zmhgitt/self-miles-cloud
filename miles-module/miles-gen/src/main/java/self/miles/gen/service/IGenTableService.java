package self.miles.gen.service;



import self.miles.gen.model.GenTable;
import self.miles.gen.utils.function.ConfigProperties;

/**
 * @ClassName: IGenTableService
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/11 17:09
 */
public interface IGenTableService {

    void generatorCode(String tableName, ConfigProperties<GenTable> fun);
}

