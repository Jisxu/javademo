package top.jisxu;

import java.time.LocalDateTime;

public class DateTimeUtil {
    public static void main(String[] args) {
        System.out.println(getDayOfYear());
    }

    public static int getDayOfYear() {
        return LocalDateTime.now().getDayOfYear();
    }
}
