package com.KFC;

public class TableCustomer implements songcan{
    public int tableId;

    @Override
    public void songcan() {
        System.out.println("将订单中的菜送达" + tableId + "号桌");

    }
}
