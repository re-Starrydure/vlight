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
