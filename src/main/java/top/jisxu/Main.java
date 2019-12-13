package top.jisxu;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String str = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
                .map(i -> i * i)
                .filter(i -> i % 2 != 0)
                .map(i -> "" + i)
                .collect(Collectors.joining("|"));
        System.out.println(str);
    }
}