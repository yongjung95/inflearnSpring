package lambda.start;

import lambda.Procedure;

import java.util.Random;

// 람다
public class Ex1RefMainV4 {

    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        //코드 조각 시작
        procedure.run();
        //코드 조각 종료

        long endNs = System.nanoTime();
        System.out.println("실행 시간: " + (endNs - startNs) + "ns");
    }

    public static void main(String[] args) {
        hello(() -> {
            long startNs = System.nanoTime();

            //코드 조각 시작
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
            //코드 조각 종료

            long endNs = System.nanoTime();
            System.out.println("실행 시간: " + (endNs - startNs) + "ns");
        });

        hello(() -> {
            long startNs = System.nanoTime();

            //코드 조각 시작
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
            //코드 조각 종료

            long endNs = System.nanoTime();
            System.out.println("실행 시간: " + (endNs - startNs) + "ns");
        });
    }
}
