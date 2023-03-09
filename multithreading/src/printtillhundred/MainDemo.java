package printtillhundred;

import printtillhundredexecutor.NumberPrinter;

public class MainDemo {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            Thread t = new Thread(np); // creating 100 threads manually
            t.start();
        }

//        // 10 Threads are created using Thread pool by ExecutorService
//        ExecutorService executor = Executors.newFixedThreadPool(10);
//
//        for (int i = 1; i <= 100; ++i) {
//            Thread.sleep(50);
//            NumberPrinter np = new NumberPrinter(i); //creating task object
//            executor.execute(np); // submitting or executing task
//        }
    }
}
