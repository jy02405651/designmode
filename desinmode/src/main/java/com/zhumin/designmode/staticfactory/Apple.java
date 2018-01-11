package com.zhumin.designmode.staticfactory;


/**
* 具体产品
* @author 朱敏
* @date 2018/1/11 0011 11:13
*/
public class Apple implements  Fruit {

    public void grow() {
        System.out.println("Apple.grow()");
    }

    public void harveset() {
        System.out.println("Apple.harveset()");
    }

    public void plant() {
        System.out.println("Apple.plant()");
    }
}
