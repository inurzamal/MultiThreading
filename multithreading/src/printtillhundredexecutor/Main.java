package printtillhundredexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 100; ++i) {
            Thread.sleep(50);
            NumberPrinter np = new NumberPrinter(i);
            executor.execute(np);
        }
    }
}

// 1) create thread pool using ExecutorService
// 2) Create task Object (Task class is created and override run() method separately)
// 3) Submit/execute the task to ExecutorService