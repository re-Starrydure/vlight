# **微光后端一轮招新第二题**


## ***Task 1***
- ### **1.   请尝试解释每个部分，回答什么是包（package），包的作用是什么，什么是main函数，并总结出一个单文件java程序的基本结构。**
- (1)第一部分:对程序所在软件包的声明，即位于com.ISEKAI包中。包是一个高于类一级的分类形式，可以将类分类储存在包中，既可以避免类命名的重复导致的矛盾,也可以使程序更有条理，方便后续查找和改进。
- (2)第二部分:导入了一个类Print，以便可以直接使用其类别中的方法（由于不在同一包中，需声明类的位置）。
- (3)第三部分:开始将main函数引入HelloWorld类别,也使用了test类中的test方法。JVM从main开始进入运行程序，main函数是程序启动的标志，是java运行必不可少的，感觉相当于大树的主干。
- (4)第四部分:构建了test类并编写了test方法，以将其链接到print类。（我观察后发现此代码通过新建一个非公共类再转向Print包中的print方法，经实测发现若删除Test类直接使用print亦可实现相同效果，推测非公共类Test作为中转站使用，以便于HelloWorld类及Print类的使用和维护（猜的，不准））。
- (5)总结:先是声明文件所在包的位置(实测若是在原根下好像就没有)；接着是所需导入的类（似乎同包的类就无需导入）；接着是主类的输入，引出main函数使JVM得以接入，主代码开始运行，最后是一些对主类有辅助作用的代码编写。



- ### **2.在运行程序时，可以给程序传入参数，由main函数的args参数接收，请你更改main函数，使用命令行或者IDEA运行这个程序传入“111 222 333”这三个参数，并在main函数中打印出来。**
- 见截图

## ***Task2***
- ### **3.在你本地的IDEA中创建上述结构的java项目，HelloWorld.java文件的内容前面已经给出，现在请你写出Print.java文件中的代码，使得该Java项目能正常运行并打印出“Hello World”。**
```
package com.ISEKAI.tool;

public class Print {
    public static void print(String xintaibengle ) {
        System.out.println(xintaibengle);
    }
}
```

***  
- 此方法为构建了一个形参，再将此形参打印出来，helloworld中应该是将”hello world"赋予此形参再打印出来。
### ***PS：***
由于前面一题分太低了，如果这题再寄就真的要逝了,所以求求多给点分吧（大哭）。本人0基础，所以要学的东西还是蛮多的，这几天也都是一直在做题，找教程,查问题，所以也还是希望有个好结果的。因为第一次做，难免有错误与不足之处，如果实在有问题，可以提一点建议吗，给个方向就行，谢谢了（抱拳）

参考网址：  
<https://www.runoob.com/java/java-package.html>  
https://blog.csdn.net/qq_41092406/article/details/118203572
https://blog.csdn.net/qq_38875767/article/details/88018004
https://docs.pingcode.com/baike/188542
https://blog.csdn.net/dear_little_bear/article/details/105514332
https://blog.csdn.net/u011441473/article/details/117768743
https://isekai.com
https://blog.csdn.net/weixin_37861326/article/details/80481486
https://blog.csdn.net/rickiyeat/article/details/55835473
https://blog.csdn.net/weixin_34379433/article/details/94336220
......