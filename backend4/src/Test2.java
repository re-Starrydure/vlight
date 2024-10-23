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