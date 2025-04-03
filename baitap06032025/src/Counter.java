public class Counter {
    private int count =0;

    public synchronized void increament () { // fix loi dùng synchronized hoặc AtomicInteger
        count ++;
    }

    public int getCount() {
        return count;
    }
}
