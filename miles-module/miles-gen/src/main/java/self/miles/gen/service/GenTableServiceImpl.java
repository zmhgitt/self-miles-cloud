package self.miles.gen.service;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ObjectUtil;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import self.miles.common.core.utils.StringUtils;
import self.miles.gen.mapper.GenTableMapper;
import self.miles.gen.model.GenTable;
import self.miles.gen.model.GenTableColumn;
import self.miles.gen.utils.GenUtils;
import self.miles.gen.utils.VelocityInitializer;
import self.miles.gen.utils.VelocityUtils;
import self.miles.gen.utils.function.ConfigProperties;

import java.io.File;
import java.io.StringWriter;
import java.util.*;


/**
 * @ClassName: GenTableColumnServiceImpl
 * @Description: 类描述
 * @author: Miles
 * @date: 2024/5/11 17:09
 */
@Service
public class GenTableServiceImpl implements IGenTableService {

    @Autowired
    private GenTableMapper genTableMapper;

    /**
     * 生成代码
     *
     * @param tableName 表名
     * @param fun       配置GenTable
     */
    @Override
    public void generatorCode(String tableName, ConfigProperties<GenTable> fun) {
        Map<String, String> dataMap = new LinkedHashMap<>();
        // 查询表信息
        GenTable table = genTableMapper.selectDbTableListByNames(tableName);
        if (Objects.isNull(table)){
            System.err.println("表不存在！！！！！！！！！！！！！！！！！！！！！");
            return;
        }
        List<GenTableColumn> columns = genTableMapper.selectDbTableColumnsByName(tableName);
        table.setColumns(columns);

        GenUtils.initTable(table);
        columns.forEach(GenUtils::initColumnField);
        // 设置主键列信息
        setPkColumn(table);
        // 让外部可以调整 table 对象值
        fun.set(table);
        // 设置主键列信息
        setPkColumn(table);
        VelocityInitializer.initVelocity();

        VelocityContext context = VelocityUtils.prepareContext(table);

        // 获取模板列表
        List<String> templates = VelocityUtils.getTemplateList(table.getTplCategory(),table.getSys());
        for (String template : templates) {
            // 渲染模板
            StringWriter sw = new StringWriter();
            Template tpl = Velocity.getTemplate(template, "UTF-8");
            tpl.merge(context, sw);
            dataMap.put(template, sw.toString());
        }

        if (Objects.nonNull(table.getOut())){
            switch (table.getOut()){
                case 1,2 :{
                    toFile(table,dataMap);
                    break;
                }
                default:{
                    toControllerLog(dataMap);
                }
            }
        }else{
            toControllerLog(dataMap);
        }
    }


    /**
     * 设置主键列信息
     *
     * @param table 业务表信息
     */
    public void setPkColumn(GenTable table) {
        for (GenTableColumn column : table.getColumns()) {
            if (column.isPk()) {
                table.setPkColumn(column);
                break;
            }
        }
        if (ObjectUtil.isNull(table.getPkColumn())) {
            table.setPkColumn(table.getColumns().get(0));
        }

    }

    private void toFile(GenTable genTable,Map<String, String> dataMap){
        final String packName = File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + genTable.getPackageName().replace(".",File.separator);
        final String resource = File.separator + "src" + File.separator + "main" + File.separator + "resources";
        dataMap.forEach((k,v)->{
            switch (k.substring(k.indexOf("/") + 1)) {
                case "java/vo.java.vm" -> {
                    String path = genTable.getAbsolutePath()
                            + packName
                            + File.separator
                            + "domain" + File.separator + "vo"
                            + File.separator
                            + genTable.getClassName()
                            + "Vo.java";
                    consoleLog(path);
                    writeFile(path, v, genTable);
                    break;
                }
                case "java/domain.java.vm" -> {
                    String path = genTable.getAbsolutePath()
                            + packName
                            + File.separator
                            + "domain" + File.separator + "po"
                            + File.separator
                            + genTable.getClassName()
                            + ".java";
                    consoleLog(path);
                    writeFile(path, v, genTable);
                    break;
                }
                case "java/bo.java.vm" -> {
                    String path = genTable.getAbsolutePath()
                            + packName
                            + File.separator
                            + "domain" + File.separator + "bo"
                            + File.separator
                            + genTable.getClassName()
                            + "Bo.java";
                    consoleLog(path);
                    writeFile(path, v, genTable);
                    break;
                }
                case "java/mapper.java.vm" -> {
                    String path = genTable.getAbsolutePath()
                            + packName
                            + File.separator
                            + "mapper" + File.separator
                            + genTable.getClassName()
                            + "Mapper.java";
                    consoleLog(path);
                    writeFile(path, v, genTable);
                    break;
                }
                case "java/service.java.vm" -> {
                    String path = genTable.getAbsolutePath()
                            + packName
                            + File.separator
                            + "service" + File.separator
                            + "I"
                            + genTable.getClassName()
                            + "Service.java";
                    consoleLog(path);
                    writeFile(path, v, genTable);
                    break;
                }
                case "java/serviceImpl.java.vm" -> {
                    String path = genTable.getAbsolutePath()
                            + packName
                            + File.separator
                            + "service" + File.separator + "impl"
                            + File.separator
                            + genTable.getClassName()
                            + "ServiceImpl.java";
                    consoleLog(path);
                    writeFile(path, v, genTable);
                    break;
                }
                case "java/controller.java.vm" -> {
                    String path = genTable.getAbsolutePath()
                            + packName
                            + File.separator
                            + "controller" + File.separator
                            + genTable.getClassName()
                            + "Controller.java";
                    consoleLog(path);
                    writeFile(path, v, genTable);
                    break;
                }
                case "xml/mapper.xml.vm" -> {
                    String path = genTable.getAbsolutePath()
                            + resource
                            + File.separator
                            + "mapper" + File.separator
                            + genTable.getClassName()
                            + "Mapper.xml";
                    consoleLog(path);
                    writeFile(path, v, genTable);
                    break;
                }
                default -> {
                    consoleLog(v);
                }
            }
        });
    }

//    /**
//     *   jwxl sync的代码生成 跟自身项目无关
//     * @param genTable
//     * @param dataMap
//     */
//    private void toFile(GenTable genTable,Map<String, String> dataMap){
//        final String packName = File.separator + "src" + File.separator + "main" + File.separator + "java" + File.separator + genTable.getPackageName().replace(".",File.separator);
//        final String resource = File.separator + "src" + File.separator + "main" + File.separator + "resources";
//        dataMap.forEach((k,v)->{
//            switch (k){
//                case "vm/syncjava/domain.java.vm":{
//                    String path = genTable.getAbsolutePath()
//                            + packName
//                            + File.separator
////                            + "domain" + File.separator + "po"
//                            + "model" + File.separator + "po"
//                            + File.separator
//                            + genTable.getClassName()
//                            + ".java";
//                    consoleLog(path);
//                    writeFile(path,v,genTable);
//                    break;
//                }
//                case "vm/syncjava/mapper.java.vm":{
//                    String path = genTable.getAbsolutePath()
//                            + packName
//                            + File.separator
//                            + "mapper" + File.separator
//                            + genTable.getClassName()
//                            + "SyncMapper.java";
//                    consoleLog(path);
//                    writeFile(path,v,genTable);
//                    break;
//                }
//                case "vm/syncjava/service.java.vm":{
//                    String path = genTable.getAbsolutePath()
//                            + packName
//                            + File.separator
//                            + "service" + File.separator
//                            + genTable.getClassName()
//                            + "SyncService.java";
//                    consoleLog(path);
//                    writeFile(path,v,genTable);
//                    break;
//                }
//                case "vm/syncjava/serviceImpl.java.vm":{
//                    String path = genTable.getAbsolutePath()
//                            + packName
//                            + File.separator
//                            + "service" + File.separator + "impl"
//                            + File.separator
//                            + genTable.getClassName()
//                            + "SyncServiceImpl.java";
//                    consoleLog(path);
//                    writeFile(path,v,genTable);
//                    break;
//                }
//                case "vm/syncjava/controller.java.vm":{
//                    String path = genTable.getAbsolutePath()
//                            + packName
//                            + File.separator
//                            + "controller" + File.separator
//                            + genTable.getClassName()
//                            + "SyncController.java";
//                    consoleLog(path);
//                    writeFile(path,v,genTable);
//                    break;
//                }
//                case "vm/syncjava/mapper.xml.vm":{
//                    String path = genTable.getAbsolutePath()
//                            + resource
//                            + File.separator
//                            + "mapper" + File.separator
//                            + genTable.getClassName()
//                            + "SyncMapper.xml";
//                    consoleLog(path);
//                    writeFile(path,v,genTable);
//                    break;
//                }
//            }
//        });
//    }

    private void toControllerLog(Map<String, String> dataMap){
        //目前只支持 控制台输出(需要其他输出方式可以拓展)
        dataMap.forEach((k, v) -> {
            consoleLog(k,ANSI_RED);
            consoleLog("--------------------------------------------------",ANSI_YELLOW);
            consoleLog("--------------------------------------------------",ANSI_YELLOW);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            consoleLog(v,ANSI_GREEN);
            consoleLog("--------------------------------------------------",ANSI_YELLOW);
            consoleLog("--------------------------------------------------",ANSI_YELLOW);
        });
    }



    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";

    /**
     * 由于日志被关闭了，所以使用System.out.println
     *
     * @param msg 控制台信息
     */
    public synchronized void consoleLog(String msg) {
        System.out.println(msg);
    }

    public synchronized void consoleLog(String msg, String color) {
        System.err.println(color + msg + ANSI_RESET);
    }


    private void writeFile(String path,String content,GenTable genTable){
        if (!FileUtil.exist(path)){
            FileUtil.writeBytes(content.getBytes(),path);
        }else{
            if (Objects.nonNull(genTable.getOut()) && genTable.getOut().equals(2)){
                FileUtil.del(path);
                FileUtil.writeBytes(content.getBytes(),path);
            }
        }
    }
}
