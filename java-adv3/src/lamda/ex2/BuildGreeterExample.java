package lamda.ex2;

public class BuildGreeterExample {

    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {
        // 코드 작성
        return s -> greeting + ", " + s; // 적절한 람다 반환
    }

    public static void main(String[] args) {
        // 코드 작성
        StringFunction helloGreeter = buildGreeter("Hello");
        String result = helloGreeter.apply("Java");
        System.out.println(result);

        StringFunction hiGreeter = buildGreeter("Hi");
        String lambda = hiGreeter.apply("Lambda");
        System.out.println(lambda);
    }
}
