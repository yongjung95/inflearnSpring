package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

    // 고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map(List<String> list, StringFunction func) {
        // 코드 작성
        ArrayList<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(func.apply(s));
        }

        return result; // 제거하고 적절한 객체를 반환
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        // 1. 대문자 변환
        // 코드 작성
        List<String> result1 = map(words, s -> s.toUpperCase());
        System.out.println("result1 = " + result1);

        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        // 코드 작성
        List<String> result2 = map(words, s -> "***" + s + "***");
        System.out.println("result2 = " + result2);

    }
}
