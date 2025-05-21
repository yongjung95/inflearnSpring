package parallel;

import static util.MyLogger.log;

public class ParallelMain2 {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        // 1. Fork 작업을 분할한다.
        SumTask sumTask1 = new SumTask(1, 4);
        SumTask sumTask2 = new SumTask(5, 8);
        Thread thread1 = new Thread(sumTask1, "SumTask1");
        Thread thread2 = new Thread(sumTask2, "SumTask2");

        // 2. 분할한 작업을 처리한다.
        thread1.start();
        thread2.start();

        // 3. join - 처리한 결과를 합친다.
        thread1.join();
        thread2.join();
        log("main 스레드 대기 완료");

        int sum = sumTask1.result + sumTask2.result;
        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime) + "ms, sum: " + sum);
    }

    static class SumTask implements Runnable {

        int startValue;
        int envValue;
        int result = 0;

        public SumTask(int startValue, int envValue) {
            this.startValue = startValue;
            this.envValue = envValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            int sum = 0;
            for (int i = startValue; i <= envValue ; i++) {
                int calculated = HeavyJob.heavyTask(i);
                sum += calculated;
            }

            result = sum;

            log("작업 완료 result = " + result);
        }
    }
}
