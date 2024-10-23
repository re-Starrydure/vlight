public class Test{
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    static void print(int n){
        int a = n / 2;
        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k < 2*i; k++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("*");
            }
            for (int j = 0; j < a  - i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }  // 打印菱形的上半部分


        System.out.print("*");
        for (int i = 0; i < n-2; i++) {
            System.out.print(" ");
        }
        if (n != 1){
            System.out.println("*");
        }  //打印菱形的中间部分


        for (int i = a; i > 0 ; i--) {
            for (int j = 0; j < a+1-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < 2*i-3; k++) {
                System.out.print(" ");
            }
            if (i != 1) {
                System.out.print("*");
            }
            for (int j = 0; j < a+1-i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }  //打印菱形的下半部分
    }
}
