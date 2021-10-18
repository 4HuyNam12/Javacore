package techmaster.vn;

import java.util.Scanner;

public class BMI {
    public static void tinhBMI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao của bạn (đơn vị mét) ");
        float height = sc.nextFloat();
        System.out.println("Nhập vào cân nặng của bạn (đơn vị kg )");
        float weight = sc.nextFloat();
        float bmi = weight / (height * height);
        System.out.println("Chỉ số BMI của bạn là: " + bmi);
    }
}
