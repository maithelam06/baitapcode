package bai4;

public class bai4 implements Runnable { // runnalbe luồng riêng

    @Override
    public void run() {
        while (true) {
            try {


            System.out.println("worker is running...");
            Thread.sleep(500);//// Ngủ 500ms trong mỗi vòng lặp
        } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Worker thread interrupted!");
            }
            System.out.println("Worker stopped.");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(new bai4()); // tao thread tu class code tren
        worker.start();
        Thread.sleep(3000);
        worker.interrupt();
    }
}
