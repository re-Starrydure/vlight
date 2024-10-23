# <center>微光后端一轮招新第四题</center>

## 1.请了解if-else相关知识。补全下面的函数：

- 代码内容

```java
import java.util.Scanner;

public class Test2 {
    static boolean isLeapYear(int year){//构造方法返回布尔值
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))//判断是否为闰年
            return true;
        else
            return false;
    }
    public static int panduan(int y){//将返回的布尔值转化为数字
        if (isLeapYear(y))
            return 1;
        else
            return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份: ");
        int year = sc.nextInt();//输入需要判断的年份
        int result = panduan(year);//将panduan方法返回的值赋予result
        System.out.println(result);//打出result
        sc.close();
    }
}
```

- 输出结果

```java
请输入年份: 2024
1
```

---

## 2.请了解for-while相关知识。补全下面函数：

- 代码内容

```java
public class TestNew {
    public static void main(String[] args) {
        int n =5;//指定菱形的高
        print(n);
    }

    static void print(int n){
        int a = n / 2+1;
        for (int i = 0; i < a ; i++) {
            for (int j =1 ; j <= n; j++) {
                System.out.print(j == a - i || j == a + i ? "*" : " ");//在对应位置打印空格或*
            } // 打印菱形的上半部分加中间一行
            System.out.println();//换行
        }
        for (int i = a-2; i >= 0 ; i--) {
            for (int j =1 ; j <= n; j++) {
                System.out.print(j == a - i || j == a + i ? "*" : " ");
            } // 打印菱形的下半部分
            System.out.println();//换行
        }
    }
}
```

- 输出结果   

```
  *   
 * *  
*   *
 * *  
  *   
```

> 此代码为一代几天后经过学习优化出的二代，一代已附于项目中（又冗杂又乱，我自己都看不下去:sob:)

---



## PS：

如果提交的答案实在有问题的话，可以给点提示或建议吗，多谢大佬（敬礼）qq:1187477643（没时间的话也没关系）

---



### 参考网址：

https://www.bilibili.com/video/BV1gb42177hm/?spm_id_from=333.999.0.0

[技巧速进！！！十分钟解决你熬夜都解不出的JAVA题|转生教程](https://www.anime-planet.com/anime/tags/isekai)

[发现这个链接的你，离人生赢家只差一次点击-CSDN博客]([Java04-流程控制 | 2024招新](https://basic.www.glimmer.org.cn/md/后端/Java04-流程控制.html))