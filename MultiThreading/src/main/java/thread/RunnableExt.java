package thread;

public class RunnableExt implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("我是实现runnable的线程" + i);
        }
    }
}
