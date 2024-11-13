package reflection;

import reflection.data.BasicData;

import java.lang.reflect.Method;

public class MethodV1 {

    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        /**
         * public 메서드만 보임 (상속 메서드 포함)
         * 해당 클래스와 상위 클래스에서 상속된 모든 public 메서드를 반환
         */
        System.out.println("====== methods() =====");
        Method[] methods = helloClass.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        /**
         * 내가 내 클래스에 선언한 모든 메서드가 보임 (상속 메서드 제외)
         * 해당 클래스에서 선언된 모든 메서드를 반환하며, 접근 제어자에 관계없이 반환. 상속된 메서드는 포함하지 않음
         */
        System.out.println("====== declaredMethods() =====");
        Method[] declaredMethods = helloClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("declaredMethod = " + method);
        }
    }
}
