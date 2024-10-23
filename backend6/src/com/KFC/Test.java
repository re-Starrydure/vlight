package com.KFC;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        system kitchenSystem = new system();
        songcan b;
        TableCustomer tableCustomer = new TableCustomer();
        WechatCustomer wechatCustomer= new WechatCustomer();
        for (int i = 0; i < 3; i++) {
            boolean a = new Random().nextBoolean();
            if (a) {
                tableCustomer.tableId =114514;
                b = tableCustomer;
            }else {
                wechatCustomer.takeout = new Random().nextBoolean();
                wechatCustomer.address = "沙河电专";
                b = wechatCustomer;
            }
            List<Order> orderList = new ArrayList<>();
            orderList.add(new Dish_1());
            orderList.add(new Dish_2());
            kitchenSystem.manageOrder(orderList,b); // 管理订单
        }
    }
}