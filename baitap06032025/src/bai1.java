public class bai1 {
    public static void main(String[] args) {


    Counter c1 = new Counter();

    Thread  th1 = new Thread(
            () -> {
                for (int i=0;i<1000;i++) {
                    c1.increament();
                }
            }
    );
    Thread th2 = new Thread(
            () -> {
                for (int i=0;i<1000;i++) {
                    c1.increament();
                }
            }
    );

    th1.start();
    th2.start();
    try {
        th1.join();
        th2.join();
    } catch (Exception e) {
        e.printStackTrace();
    }
    System.out.println("cout "+c1.getCount());
}
}
