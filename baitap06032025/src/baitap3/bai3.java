package baitap3;

public class bai3 {
    public static void main(String[] args) {
        Thread th1 = new Thread( () -> {
            while (true) {
                System.out.println("high priority thread running");
                Thread.yield();// Stavation fix lỗi 1 là dùng thread .yield hoặc dùng  faik lock
            }
        }
        );
        Thread th2= new Thread( () -> {
            while (true) {
                System.out.println("low priority thread running");
            }
        }

        );
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
    }
}
