package com.KFC;

import java.util.Random;

public class Dish_1 extends Dish implements Order{
    public Dish_1(){
        super("碘籽颗炟--砂禾味",1956.9);
    }

    @Override
    public void profile() {
        System.out.println("碘籽颗炟--砂禾味是一份老少皆宜的美味佳肴，在年轻人中尤其受到喜爱，在业界有‘砂禾碘砖’的美誉。其历史渊源可以追溯到上世纪中叶，口味与佐料也随时间有着些许的变动。其中较为出名的一类制作流程为；先对原料进行高烤，再投入烤档中，加以调剂，最后历经三个月的发酵产生。");
    }

    @Override
    public void cook() {
        System.out.println("准备石卷作为工具，高烤原料生中糕，准备调剂与薯荚，再进行三个月的发酵");
    }

    @Override
    public boolean check() {
        return new Random().nextBoolean();
    }
}

