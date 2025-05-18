package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MapMainV2 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> numbers = map(list, v -> Integer.valueOf(v));
        System.out.println("numbers = " + numbers);

        // 문자열의 길이
        List<Integer> lengths = map(list, v -> v.length());
        System.out.println("lengths = " + lengths);
    }

    static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> result = new ArrayList<>();

        for (String s : list) {
            result.add(mapper.apply(s));
        }

        return result;
    }
}
