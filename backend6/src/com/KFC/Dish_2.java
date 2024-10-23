package com.KFC;

import java.util.Random;

public class Dish_2 extends Dish implements Order{
    public Dish_2() {
        super("番茄炒西红柿", 114.514);
    }

    @Override
    public void profile() {
        System.out.println("番茄炒西红柿是普通的新式菜肴，烹调方法比较简单，而且营养搭配合理。色泽鲜艳，口味宜人，深受大众喜爱。其营养价值丰富，具有营养素互补的特点以及健美抗衰老的作用。番茄含有丰富的胡萝卜素、维生素C和B族维生素，番茄红素具有独特的抗氧化能力。西红柿含有大量的维生素和矿物质及有高生物价的番茄红素。柿中含有丰富的糖类等，对神经系统和身体发育有非常好的作用，深受人们的喜爱。");
    }

    @Override
    public void cook() {
        System.out.println("分别使用番茄与西红柿切成小块，再依次放入锅中进行煎炒，西红柿要比番茄早放约一分钟左右，注意由于二者外表接近，一定要仔细观察，不能弄混！！！");
    }

    @Override
    public boolean check() {
        return new Random().nextBoolean();
    }
}
