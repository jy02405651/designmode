package com.zhumin.designmode.factory;

/**
* 定义一个抽象出来的工厂
* @author 朱敏
* @date 2018/1/11 0011 10:06
*/
public interface ExportFactory {

    public ExportFile factory(String type);

}
