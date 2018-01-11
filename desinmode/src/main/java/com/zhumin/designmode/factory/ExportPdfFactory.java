package com.zhumin.designmode.factory;


/**
* 定义一个具体工厂引向某个具体动作
* @author 朱敏
* @date 2018/1/11 0011 10:21
*/
public class ExportPdfFactory implements ExportFactory {

    public ExportFile factory(String type)
    {
        if ("standard".equals(type))
        {
            return new ExportStandardPdfFile();
        }
        else if ("financial".equals(type))
        {
            return new ExportFinancialPdfFile();
        }
        return null;
    }

}
