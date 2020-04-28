package com.itzfq.code.build;

import java.util.Map;

/***
 * @Description 生成Swagger
 * @Author zhangFengQin
 * @Date Created in 2020/4/28 15:56
 * @Version V 0.0.1
 * @Modified By:
 *
 **/
public class SwaggerBuilder {

    /**
     * @param modelMap 数据模型
     * @return void
     * @Description ServiceImpl构建
     * @Date 2020/4/28 0028 16:12
     * @Author zhangFengQin
     * @Version V 0.0.1
     * @Modified By:
     */
    public static void builder(Map<String, Object> modelMap) {
        //swagger的文件名字
        modelMap.put("Table", "swagger");

        //生成ServiceImpl层文件
        BuilderFactory.builder(modelMap,
                "/template/swagger",
                "swagger.json",
                TemplateBuilder.SWAGGERUI_PATH,
                ".json");
    }
}
