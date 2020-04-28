package com.itzfq.code.build;

import java.util.Map;

/***
 * @Description Controller构建
 * @Author zhangFengQin
 * @Date Created in 2020/4/28 15:56
 * @Version V 0.0.1
 * @Modified By:
 *
 **/
public class ControllerBuilder {

    /**
     * @param modelMap 数据模型
     * @return void
     * @Description 构建Controller
     * @Date 2020/4/28 16:01
     * @Author zhangFengQin
     * @Version V 0.0.1
     * @Modified By:
     */
    public static void builder(Map<String, Object> modelMap) {
        //生成Controller层文件
        BuilderFactory.builder(modelMap,
                "/template/controller",
                "Controller.java",
                TemplateBuilder.PACKAGE_CONTROLLER,
                "Controller.java");
    }

}
