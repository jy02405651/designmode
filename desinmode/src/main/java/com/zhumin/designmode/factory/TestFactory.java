package com.zhumin.designmode.factory;

import org.junit.jupiter.api.Test;

/**
* 测试工厂方法模式
* @author 朱敏
* @date 2018/1/11 0011 10:23
*/
public class TestFactory {

    @Test
    public void test(){
        ExportFactory fac = new ExportHtmlFactory();
        ExportFile file = fac.factory("financial");
        file.export("data");
    }
}
