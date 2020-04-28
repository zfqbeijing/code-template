package com.itzfq.code.build;

import java.util.Map;

/***
 * @Description Dao构建
 * @Author zhangFengQin
 * @Date Created in 2020/4/28 15:56
 * @Version V 0.0.1
 * @Modified By:
 *
 **/
public class DaoBuilder {


    /***
     * 构建Dao
     * @param modelMap
     */
    /**
     * @param modelMap 数据模型
     * @return void
     * @Description 构建Dao
     * @Date 2020/4/28 16:03
     * @Author zhangFengQin
     * @Version V 0.0.1
     * @Modified By:
     */
    public static void builder(Map<String, Object> modelMap) {
        //生成Dao层文件
        BuilderFactory.builder(modelMap,
                "/template/dao",
                "Mapper.java",
                TemplateBuilder.PACKAGE_MAPPER,
                "Mapper.java");
    }

}
