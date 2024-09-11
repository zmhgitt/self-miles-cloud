package self.miles.gen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import self.miles.common.redis.utils.RedisUtils;
import self.miles.gen.constant.GenConstants;
import self.miles.gen.service.IGenTableService;

import java.io.IOException;

/**
 * @ClassName: GenTest
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/31 14:33
 */

@SpringBootTest(classes = SelfGenApplication.class)
public class GenTest {

    @Autowired
    private IGenTableService genTableService;

    @Test
    public void gen() {
        genTableService.generatorCode("sys_user",genTable -> {
            genTable.setTplCategory("crud");
//            genTable.setOut(1);
        });
    }

    // video_sign  study  topic  subject  test  question questionbank
    @Test
    public void ares() {
        genTableService.generatorCode("client_info",genTable -> {
            genTable.setTplCategory("crud");
            genTable.setSys(GenConstants.SYS_ARES);
            genTable.setOut(1);
        });
    }

//    @Test
//    public void testRedis() throws IOException {
////        RedisUtils.setCacheObject("Test","111111111");
//        String test = RedisUtils.getCacheObject("Test");
//        System.out.println(test);
//
//    }
}
