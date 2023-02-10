package ex3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLambda {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println(" thread1" ));
        Thread t2 = new Thread(() -> System.out.println(" thread2" ));
        Thread t3 = new Thread(() -> System.out.println(" thread3" ));
        Thread t4 = new Thread(() -> System.out.println(" thread4" ));

        t1.run();
        t2.run();
        t3.run();
        t4.run();


        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
        });

        executorService.shutdown();

        executorService.submit(() -> Thread.currentThread().getName());
    }
}
