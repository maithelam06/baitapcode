package bai2;

public class bai2 {
    private static final  Object h1=  new Object();
    private static final  Object h2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread( () -> {
            synchronized (h1) {
                System.out.println("Thread 1: locked resoure 1");
                try {
                    int i = 4;
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (h2) {
                    System.out.println("Thread 2: locked resouce 1");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (h1) { // ta đóng luồng 1 theo thứ tự như v thì k xảy ra deadlock hoặc dùng trylock
                System.out.println("thread 2 : locked resource 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (h2) {
                    System.out.println("Thread 2 : locked resource 2");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
