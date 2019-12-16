package Bench;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyBenchmark implements MyBenchmarkMBean {
    private final int loopCounter;
    private volatile int size=0;

    Random random = new Random();

    ArrayList list1 =new ArrayList<Person>();
    ArrayList list2 =new ArrayList<Person>();
    ArrayList list3 =new ArrayList<Person>();
    ArrayList list4 =new ArrayList<Person>();
    ArrayList list5 =new ArrayList<Person>();
    ArrayList list6 =new ArrayList<Person>();
    ArrayList list7 =new ArrayList<Person>();
    ArrayList list8 =new ArrayList<Person>();
    ArrayList list9 =new ArrayList<Person>();
    ArrayList list10 =new ArrayList<Person>();

    public MyBenchmark(int loopCounter) {
        this.loopCounter = loopCounter;
    }

    void run () throws InterruptedException {
        for (int idx=0; idx<loopCounter;idx++){

            list1.add(new Person("Toly", "Kalach", random.nextInt(10-1)^2, "M",new Cat("Katy", 2)));
            list2.add(new Person("Pety", "Lolka", random.nextInt(10-1)^3, "M",new Cat("Misha", 2)));
            list3.add(new Person("Oly", "Mira", random.nextInt(10-1)^4, "W",new Cat("Linda", 2)));
            list4.add(new Person("Oly", "Mira", random.nextInt(10-1)^5, "W",new Cat("Linda", 2)));
            list5.add(new Person("Oly", "Mira", random.nextInt(10-1)^6, "W",new Cat("Linda", 2)));
            list6.add(new Person("Oly", "Mira", random.nextInt(10-1)^6, "W",new Cat("Linda", 2)));
            list7.add(new Person("Oly", "Mira", random.nextInt(10-1)^6, "W",new Cat("Linda", 2)));
            list8.add(new Person("Oly", "Mira", random.nextInt(10-1)^6, "W",new Cat("Linda", 2)));
            list9.add(new Person("Oly", "Mira", random.nextInt(10-1)^6, "W",new Cat("Linda", 2)));
            list10.add(new Person("Oly", "Mira", random.nextInt(10-1)^5, "W",new Cat("Linda", 2)));

            try {
                if (idx%3==0 && idx>3){
                    list1.remove(0);
                    list2.remove(0);
                    list3.remove(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
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
