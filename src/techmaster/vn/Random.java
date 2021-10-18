package techmaster.vn;

import java.util.concurrent.ThreadLocalRandom;

public class Random {
    public static void kiemTraChanLe() {
        int randNum = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("Số ngẫu nhiên chọn là: " + randNum);
        String resule = randNum % 2 == 0 ? "Số:" + randNum + " là số chẵn" : "Số:" + randNum + " là số lẻ";
        System.out.println(resule);
    }
}
