package techmaster.vn;

import java.util.Locale;


public class Excercise1 {
    public static void s_excercise1() {
        String s = "học lập trình java không khó";
        System.out.println("Độ dài của chuỗi là: " + s.length());
        System.out.println("Chuỗi viết hoa tất cả chữ k trong chuỗi là: " + s.replace('k','K'));
        System.out.println("Chuỗi sau khi thay thế chữ khó thành chữ dễ là:"+s.replace("khó","dễ"));
        System.out.println("Index của ký tự j trong chuỗi là: " + s.indexOf('j'));


    }


}
