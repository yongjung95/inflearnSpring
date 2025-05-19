package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {

    public static void main(String[] args) {
        // 기본형 특화 스트림 생성 (IntStream, LongStream, DoubleStream)
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 범위 생성 메서드 (IntStream, LongStream 가능)
        IntStream range1 = IntStream.range(1, 6); // [1,2,3,4,5]
        IntStream range2 = IntStream.rangeClosed(1, 5); // [1,2,3,4,5]

        // 1. 통계 관련 메서드 (sum, average, max, min ,count)
        // sum(): 합계 계산
        int sum = IntStream.range(1, 6).sum(); // 15
        System.out.println("sum = " + sum);

        // average(): 평균값 계산
        double avg = IntStream.range(1, 6)
                .average()
                .getAsDouble(); // 3.0
        System.out.println("avg = " + avg);

        // summaryStatistics(): 모든 통계 정보
        IntSummaryStatistics stats = IntStream.range(1,
                6).summaryStatistics();
        System.out.println("합계: " + stats.getSum()); // 15
        System.out.println("평균: " + stats.getAverage()); // 3.0
        System.out.println("최댓값: " + stats.getMax()); // 5
        System.out.println("최솟값: " + stats.getMin()); // 1
        System.out.println("개수: " + stats.getCount()); // 5

        // 2. 타입 변환 메서드
        // IntStream -> LongStream
        LongStream longStream = IntStream.range(1, 5).asLongStream();
        // IntStream -> DoubleStream
        DoubleStream doubleStream = IntStream.range(1, 5).asDoubleStream();
        // IntStream -> Stream<Integer>
        Stream<Integer> boxedStream = IntStream.range(1, 5).boxed();

        // 3. 기본형 특화 매핑
        // int -> long 변환 매핑
        LongStream mappedLong = IntStream.range(1, 5)
                .mapToLong(i -> i * 10L);

        // int -> double 변환 매핑
        DoubleStream mappedDouble = IntStream.range(1, 5)
                .mapToDouble(i -> i * 1.5);

        // int -> 객체 변환 매핑
        Stream<String> mappedObj = IntStream.range(1, 5)
                .mapToObj(i -> "Number: " + i);

        // 4. 객체 스트림 -> 기본형 특화 스트림으로 매핑
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream = integerStream.mapToInt(i -> i);

        // 5. 객체 스트림 -> 기본형 특화 스트림으로 매핑 활용
        int result = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(i -> i)
                .sum();
        System.out.println("result = " + result);
    }
}
