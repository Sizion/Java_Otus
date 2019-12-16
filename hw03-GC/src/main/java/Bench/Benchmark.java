package Bench;

public class Benchmark implements BenchmarkMBean {
    private final int loopCounter;
    private volatile int size=0;

    public Benchmark(int loopCounter) {
        this.loopCounter = loopCounter;
    }

    void run () throws InterruptedException {
        for (int idx=0; idx<loopCounter;idx++){
            int local = size;
            Object[] array = new Object[local];
            for (int i=0; i<local;i++){
                array[i]=new String (new char[0]);
            }
            Thread.sleep(10);
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void setSize(int size) {
        System.out.println("New size: "+size);
        this.size=size;
    }
}
