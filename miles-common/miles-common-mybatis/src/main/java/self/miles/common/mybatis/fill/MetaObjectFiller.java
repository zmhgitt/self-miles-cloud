package self.miles.common.mybatis.fill;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import self.miles.common.core.exception.ServiceException;
import self.miles.common.core.utils.DateUtils;
import self.miles.common.mybatis.core.domain.BaseEntity;

import java.util.Date;
import java.util.Objects;

/**
 * @ClassName: MetaObjectFiller
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/31 10:46
 */
public class MetaObjectFiller implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        try{
            insertFillHandle(metaObject);
        }catch (Exception e){
            throw new ServiceException("操作失败，原因：自动注入错误");
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        try{
            updateFillHandle(metaObject);
        }catch (Exception e){
            throw new ServiceException("操作失败，原因：自动注入错误");
        }
    }

    private void insertFillHandle(MetaObject metaObject){
        if (Objects.nonNull(metaObject) && metaObject.getOriginalObject() instanceof BaseEntity baseEntity){
            Date fillDate = Objects.nonNull(baseEntity.getCreateTime())
                    ? baseEntity.getCreateTime() : DateUtils.dateNow();
            baseEntity.setCreateTime(fillDate);
            baseEntity.setUpdateTime(fillDate);

            //暂时固定
            baseEntity.setCreateBy(0L);
            baseEntity.setUpdateBy(0L);
        }
    }

    private void updateFillHandle(MetaObject metaObject){
        if (Objects.nonNull(metaObject) && metaObject.getOriginalObject() instanceof BaseEntity baseEntity){
            Date fillDate = Objects.nonNull(baseEntity.getCreateTime())
                    ? baseEntity.getCreateTime() : DateUtils.dateNow();
            baseEntity.setUpdateTime(fillDate);

            //暂时固定
            baseEntity.setUpdateBy(0L);
        }
    }
}
