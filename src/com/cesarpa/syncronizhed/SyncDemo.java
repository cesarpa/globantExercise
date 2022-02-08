package com.cesarpa.syncronizhed;

class Counter {
     int counter;

    public synchronized void increment(){
        counter++;
    }
}


public class SyncDemo {
    public static void main(String[] args) throws Exception {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i< 100000; i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i< 100000; i++){
                    c.increment();
                }
            }
        });
        t2.start();
        t1.start();
        t1.join();
        t2.join();
        System.out.println("Count: "+c.counter);
    }

}
