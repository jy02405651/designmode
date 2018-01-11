package com.zhumin.designmode.staticfactory;

/**
* 封装调用具体产品的一个园丁
* @author 朱敏
* @date 2018/1/11 0011 11:15
*/
public class Gardener {

    public static Fruit getFruit(String fruit){

        if ("apple".equalsIgnoreCase(fruit))
        {
            return new Apple();
        }
            return null;
    }
}
