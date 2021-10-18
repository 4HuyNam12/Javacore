package techmaster.vn;

import java.util.Scanner;

public class Excercise2 {
    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên x ");
        int x = sc.nextInt();
        System.out.println("Nhập vào số nguyên y ");
        int y = sc.nextInt();
        float z = (float) x / y;
        System.out.println("Tổng của hai số x và y là: " + (x + y));
        System.out.println("Hiệu của hai số x và y là: " + (x - y));
        System.out.println("Tích của hai số x và y là: " + (x * y));
        System.out.println("Thương của hai số x và y là: " + z);

    }
}
