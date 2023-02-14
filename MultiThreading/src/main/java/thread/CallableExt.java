package thread;

import java.util.concurrent.Callable;

public class CallableExt implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.printf("我是继承Callable的线程" + i + "\n");
        }
        return "Call返回";
    }
}
