package com.xiaoban.freemarkerdemo.demo;


import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
/**
* 核心方法
*
* @author xiaoban
* @version 1.0.0
* @create 2021/04/09 - 15:55
*/
public class FreeMarkerDemo {

    private static final String TEMPLATE_PATH = "src/main/resources/templates";

    /**
     * 演示了FreeMarker解析的例子
     * */
    public static void main(String[] args) {
        // step1 创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 获取模版路径
            configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
            // step3 创建数据模型
            Map<String, Object> dataMap = new HashMap<String, Object>();
            List<String> names = new ArrayList<>();
            names.add("张三");
            names.add("李四");
            names.add("王五");
            String name = "xiaoban";
            dataMap.put("name",name);
            dataMap.put("names",names);
            // step4 加载模版文件
            Template template = configuration.getTemplate("index.ftl");
            // step5 生成数据
            out = new OutputStreamWriter(System.out);
            // step6 输出文件
            template.process(dataMap, out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}