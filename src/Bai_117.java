import java.util.Scanner;

public class Bai_117 {
    /*
    Viết chương trình nhập n và tính tổng
    S(n) = x = x^2 + x^3 + ... + x^n
     */
    //hàm tính a^b (b là số nguyên)
    public static double luyThua(double a, int b){
        int _b = Math.abs(b);
        double t = 1;
        for (int i = 0; i < -b; i++){
            t = t*a;
        }
        if (b > 0){
            return t;
        }else {
            return 1/t;
        }
    }
//    public static int Sum(int x, int n) {
//        int s = 0;
//        for (int i = 1; i <= n; i++) {
//            s += Math.pow(x, i);
//        }
//        return s;
//    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Nhập x, n: ");
//        int x = in.nextInt();
//        int n = in.nextInt();
//        System.out.println("Tổng S(n) = " + Sum(x,n));
        double x = 1.5;
        int n = 3;
        double tmp = 0;
        for (int i = 1; i < n; i++){
            tmp = tmp + luyThua(x, i);
        }
        System.out.println("S(n) = "+ tmp);
    }
}
