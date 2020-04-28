package com.itzfq.code.build;

import java.util.Map;

/***
 * @Description Feign构建
 * @Author zhangFengQin
 * @Date Created in 2020/4/28 15:56
 * @Version V 0.0.1
 * @Modified By:
 *
 **/
public class FeignBuilder {

    /**
     * @param modelMap 数据模型
     * @return void
     * @Description 构建Feign
     * @Date 2020/4/28 16:05
     * @Author zhangFengQin
     * @Version V 0.0.1
     * @Modified By:
     */
    public static void builder(Map<String, Object> modelMap) {
        //生成Dao层文件
        if (TemplateBuilder.PACKAGE_FEIGN==null){
            return;
        }
        BuilderFactory.builder(modelMap,
                "/template/feign",
                "Feign.java",
                TemplateBuilder.PACKAGE_FEIGN,
                "Feign.java");
    }

}
