package com.zhumin.designmode.staticfactory;

import org.junit.jupiter.api.Test;

/**
* 测试静态工厂
* @author 朱敏
* @date 2018/1/11 0011 11:17
*/
public class TestStaticFactory {

    @Test
    public void test(){
       Fruit fruit = Gardener.getFruit("apple");
       fruit.grow();
       fruit.harveset();
       fruit.plant();
    }

}
