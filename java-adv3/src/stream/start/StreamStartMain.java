package stream.start;

import java.util.List;
import java.util.stream.Stream;

public class StreamStartMain {
    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Banana", "Orange", "Berry");

        Stream<String> stream = names.stream();
        List<String> result = stream
                .filter(name -> name.startsWith("B"))
                .map(s -> s.toUpperCase())
                .toList();

        System.out.println("=== 외부 반복 ===");
        for (String s : result) {
            System.out.println("s = " + s);
        }

        System.out.println("=== forEach, 내부 반복 ===");
        names.stream()
                .filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(s -> System.out.println("s = " + s));

        System.out.println("=== 메서드 참조 ===");
        names.stream()
                .filter(name -> name.startsWith("B"))
                .map(String::toUpperCase) // 임의 객체의 인스턴스 메서드 참조 (매개변수 참조)
                .forEach(System.out::println); // 특정 객체의 인스턴스 메서드 참조
    }
}
