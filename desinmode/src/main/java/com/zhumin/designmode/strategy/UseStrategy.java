package com.zhumin.designmode.strategy;

/**
* 定义一个策略中心来使用它
* @author 朱敏
* @date 2018/1/10 0010 17:10
*/
public class UseStrategy implements Strategy{

    private Strategy strategy;

    /**
    * 定于构造器传入具体的策略对象
    * @param
    * @return
    * @author 朱敏
    * @date 2018/1/10 0010 17:11
    */
    public UseStrategy( Strategy strategy) {
        this.strategy = strategy;
    }

    public void opt() {
        System.out.println("欢迎来到策略中心");
        strategy.opt();
    }
}
