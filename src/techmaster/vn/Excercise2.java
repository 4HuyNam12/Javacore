package techmaster.vn;

public class Excercise2 {
    public static void substring(){
        String s2 ="học lập trình java không khó";
        String firstLetter = s2.substring(0,1);
        String lastLetter = s2.substring(s2.length()-1,s2.length());
        String remainLetter =s2.substring(1,s2.length()-1);
        firstLetter = firstLetter.toUpperCase();
        lastLetter =  lastLetter.toUpperCase();
        s2= firstLetter + remainLetter +lastLetter;
        System.out.println("Chuỗi sau khi viết hoa chữ cái đầu và chữ cái cuối là : " +s2);
    }
}
