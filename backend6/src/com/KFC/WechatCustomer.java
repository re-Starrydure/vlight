package com.KFC;

public class WechatCustomer implements songcan {
    public String address;//顾客地址
    public boolean takeout;//true代表该顾客是外卖，false代表该顾客是堂食

    @Override
    public void songcan() {
        if (takeout) {
            System.out.println("将外卖送到顾客地址——" + address);
        }
    }
}
