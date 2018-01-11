package com.zhumin.designmode.factory;

/**
* 定义一个具体工厂引向某个具体动作
* @author 朱敏
* @date 2018/1/11 0011 10:14
*/
public class ExportHtmlFactory implements  ExportFactory {


    public ExportFile factory(String type) {
        if(("financial").equals(type)){
            return new ExportFinancialHtmlFile();
        }else if("standard".equals(type)){
            return new ExportStandardHtmlFile();
        }
        return null;
    }
}
