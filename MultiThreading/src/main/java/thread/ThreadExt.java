package thread;

public class ThreadExt extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("我是继承Thread的线程" + i + "\n");
        }
    }
}
