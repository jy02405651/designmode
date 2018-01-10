package com.zhumin.designmode.zhuangshiqi;

import org.junit.jupiter.api.Test;

public class DaoMain {

    @Test
    public void testDao(){
        Dao dao  = new DaoImpl();
        ZhuangShiQi zsq = new ZhuangShiQi(dao);
        zsq.insert();
        zsq.delete();
        zsq.update();
    }

}
