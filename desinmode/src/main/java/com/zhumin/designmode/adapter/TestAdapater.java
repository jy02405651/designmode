package com.zhumin.designmode.adapter;

import org.junit.jupiter.api.Test;

/**
* 测试适配器模式
* @author 朱敏
* @date 2018/1/11 0011 14:46
*/
public class TestAdapater {

    @Test
    public void test(){
       ClassTarget adapater  = new ClassAdapater();
       adapater.sourceOpt();
       adapater.adpaterOpt();
   }

}
