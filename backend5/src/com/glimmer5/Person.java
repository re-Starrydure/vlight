package com.glimmer5;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private int sex;
//    private static int i;//计数的


    private static List<WeakReference<Person>> list = new ArrayList<>();


    public Person() {
        WeakReference<Person> weakReference = new WeakReference<>(this);
        list.add(weakReference);
 //       i++;
    }//无参构造器

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
 //       i++;
        WeakReference<Person> weakReference = new WeakReference<>(this);
        list.add(weakReference);
    }//有参构造器

    public Person(Person from){//形参为一个Person对象
        this.name = from.name;
        this.age = from.age;
        this.sex = from.sex;
   //     i++;
        WeakReference<Person> weakReference = new WeakReference<>(this);
        list.add(weakReference);

    }



    public void eat() {
        System.out.println(name+"正在吃东西");
    }

    public void sleep() {
        System.out.println(name+"正在睡觉");
    }

    public void dadoudou() {
        System.out.println(name+"正在打豆豆");
    }


//    @Override
//    public void finalize() throws Throwable {
//        super.finalize();
//        i--;
//    }


    public static void count(){
        System.gc();
        for (int j = list.size() - 1; j >= 0; j--) {//反向修改，避免出错（反正这里正向答案会不对）
            if (list.get(j).get() == null) {
                list.remove(j);
            }
        }
        System.out.println("该类的对象个数为"+ list.size() +"个哦~~");
    }
}