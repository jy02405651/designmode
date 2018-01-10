package com.zhumin.designmode.strategy;

import org.junit.jupiter.api.Test;

/**
* 策略模式
* @param
* @return
* @author 朱敏
* @date 2018/1/10 0010 17:14
*/
public class TestStrategy {

    @Test
    public void test(){
        //使用策略A
        Strategy strategy = new StrategyA();
        UseStrategy us = new UseStrategy(strategy);
        us.opt();

    }

}
