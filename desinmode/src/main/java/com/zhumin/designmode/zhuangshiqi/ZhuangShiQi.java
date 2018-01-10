package com.zhumin.designmode.zhuangshiqi;

public class ZhuangShiQi implements Dao {

    private Dao dao;

    public ZhuangShiQi(Dao dao) {
        this.dao = dao;
    }

    public void insert() {
        System.out.println("insert()方法开始时间：" + System.currentTimeMillis());
        dao.insert();
        System.out.println("insert()方法结束时间：" + System.currentTimeMillis());
    }

    public void delete() {
        System.out.println("delete()方法开始时间：" + System.currentTimeMillis());
        dao.delete();
        System.out.println("delete()方法结束时间：" + System.currentTimeMillis());
    }

    public void update() {
        System.out.println("update()方法开始时间：" + System.currentTimeMillis());
        dao.update();
        System.out.println("update()方法结束时间：" + System.currentTimeMillis());
    }

}
