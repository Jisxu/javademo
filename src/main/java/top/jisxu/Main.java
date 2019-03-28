package top.jisxu;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String word = "hello world";
        Map<String, Integer> map = Arrays.stream(word.split(""))
                .map(String::toUpperCase)
                .collect(Collectors.toMap(s -> s, s -> 1, (s1, s2) -> s1 + s2));
        System.out.println(map);
    }
}
