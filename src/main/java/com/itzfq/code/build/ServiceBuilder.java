package com.itzfq.code.build;

import java.util.Map;

/***
 * @Description Service构建
 * @Author zhangFengQin
 * @Date Created in 2020/4/28 15:56
 * @Version V 0.0.1
 * @Modified By:
 *
 **/
public class ServiceBuilder {

    /**
     * @Description 构建Service
     * @Date 2020/4/28 0028 16:08
     * @Author zhangFengQin
     * @param modelMap 数据模型
     * @return void
     * @Version V 0.0.1
     * @Modified By:
     */
    public static void builder(Map<String,Object> modelMap){
        //生成Service层文件
        BuilderFactory.builder(modelMap,
                "/template/service",
                "Service.java",
                TemplateBuilder.PACKAGE_SERVICE_INTERFACE,
                "Service.java");
    }

}
