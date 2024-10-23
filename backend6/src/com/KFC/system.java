package com.KFC;

import java.util.List;

public class system{
    private int a =1;

    //请补全处理订单的函数
    public <T extends songcan> void manageOrder (List<Order> dishes, T b){
        boolean c = true;
        for (Order dish : dishes) {
            if (dish.check()){
                System.out.println("取消订单");
                c = false;
                break;
            }
        }

        if (c) {
            for (Order dish : dishes) {
                dish.cook();
            }
            b.songcan();
            System.out.println("当前的订单编号为：" + (a++));
        }
    }
}
