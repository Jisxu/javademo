package top.jisxu;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String word = "祥瑞生辉三羊献瑞三羊生瑞气";
        Map<String, Integer> map = Arrays.stream(word.split(""))
                .map(String::toUpperCase)
                .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        System.out.println(map);
    }
}
