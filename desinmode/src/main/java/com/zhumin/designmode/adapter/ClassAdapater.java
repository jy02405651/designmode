package com.zhumin.designmode.adapter;


/**
* 适配器
* @author 朱敏
* @date 2018/1/11 0011 14:55
*/
public class ClassAdapater extends ClassAdaptee implements ClassTarget {

    public void adpaterOpt() {
        System.out.println("我是扩展方法");
    }
}
