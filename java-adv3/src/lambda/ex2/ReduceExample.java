package lambda.ex2;

import lambda.start.Ex1RefMain;

import java.util.List;

public class ReduceExample {

    // 함수를 인자로 받아, 리스트 요소를 하나로 축약(reduce)하는 고차 함수
    public static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        // 코드 작성
        for (Integer i : list) {
            initial = reducer.reduce(initial, i);
        }

        return initial; // 적절한 값으로 변경
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);
        // 1. 합 구하기 (초깃값 0, 덧셈 로직)
        // 코드 작성
        int result = reduce(numbers, 0, Integer::sum);
        System.out.println("result = " + result);

        // 2. 곱 구하기 (초깃값 1, 곱셈 로직)
        // 코드 작성
        int result2 = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("result2 = " + result2);
    }
}
