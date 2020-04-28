package com.itzfq.code.build;

import freemarker.template.Template;

import java.io.File;
import java.util.Map;

/***
 * @Description 构建对象的工厂
 * @Author zhangFengQin
 * @Date Created in 2020/4/28 15:56
 * @Version V 0.0.1
 * @Modified By:
 *
 **/
public class BuilderFactory {


    /**
     * @param modelMap     数据模型
     * @param templatePath 模板路径
     * @param templateFile 模板文件
     * @param storePath    存储路径
     * @param suffix       生成文件后缀名字
     * @return void
     * @Description 构建Controller
     * @Date 2020/4/28 15:57
     * @Author zhangFengQin
     * @Version V 0.0.1
     * @Modified By:
     */
    public static void builder(Map<String, Object> modelMap,//数据模型
                               String templatePath, //模板路径
                               String templateFile, //模板文件
                               String storePath,    //存储路径
                               String suffix) {      //生成文件后缀名字

        try {
            //获取模板对象
            Template template = TemplateUtil.loadTemplate(ControllerBuilder.class.getResource(templatePath).getPath(), templateFile);

            //创建文件夹
            String path = TemplateBuilder.PROJECT_PATH + storePath.replace(".", "/");
            File file = new File(path);
            if (!file.exists()) {
                file.mkdirs();
            }

            //创建文件
            TemplateUtil.writer(template, modelMap, path + "/" + modelMap.get("Table") + suffix);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
