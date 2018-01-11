package com.zhumin.designmode.factory;

/**
* 定义一个具体导出动作继承抽象动作接口
* @author 朱敏
* @date 2018/1/11 0011 10:11
*/
public class ExportFinancialPdfFile implements ExportFile
{
    public boolean export(String data)
    {
        System.out.println("导出财务版PDF文件");
        return true;
    }
}
