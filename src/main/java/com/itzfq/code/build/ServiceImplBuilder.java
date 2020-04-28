package com.itzfq.code.build;

import java.util.Map;

/***
 * @Description ServiceImpl构建
 * @Author zhangFengQin
 * @Date Created in 2020/4/28 15:56
 * @Version V 0.0.1
 * @Modified By:
 *
 **/
public class ServiceImplBuilder {

    /**
     * @param modelMap 数据模型
     * @return void
     * @Description ServiceImpl构建
     * @Date 2020/4/28 16:10
     * @Author zhangFengQin
     * @Version V 0.0.1
     * @Modified By:
     */
    public static void builder(Map<String, Object> modelMap) {
        //生成ServiceImpl层文件
        BuilderFactory.builder(modelMap,
                "/template/service/impl",
                "ServiceImpl.java",
                TemplateBuilder.PACKAGE_SERVICE_INTERFACE_IMPL,
                "ServiceImpl.java");
    }

}
