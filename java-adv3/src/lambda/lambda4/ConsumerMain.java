package lambda.lambda4;

import java.util.function.Consumer;

public class ConsumerMain {

    public static void main(String[] args) {
        // 익명 클래스
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("s = " + s);
            }
        };

        consumer1.accept("hello consumer");

        // 람다
        Consumer<String> consumer2 = s -> System.out.println("s = " + s);

        consumer2.accept("hello consumer");
    }
}
