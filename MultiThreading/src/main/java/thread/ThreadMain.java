package thread;

import java.util.concurrent.*;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadExt thread1 = new ThreadExt();
        thread1.run();
        CallableExt thread2 = new CallableExt();
        FutureTask<String> task = new FutureTask<>(new CallableExt());
        task.run();
        Thread task1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.printf("我是匿名线程-" + i);
            }
        });
        task1.run();

    }
}
