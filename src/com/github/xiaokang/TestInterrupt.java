package com.github.xiaokang;

public class TestInterrupt {
  static class MyThread extends Thread {
    public volatile boolean stop;
    public void run() {
      long time = 0;
      long t = 0;
      for (int i = 0; i < 10000000 && !stop; i++) {
        t = System.currentTimeMillis();
        if (t != time) {
        System.out.println(t);
        time = t;
        }
      }
    }
  }
  
  public static void main(String[] args) throws InterruptedException {
    MyThread t = new MyThread();
    t.start();
    Thread.sleep(10);
    System.out.println("main " + System.currentTimeMillis());
    System.out.println("main " + System.currentTimeMillis());
    t.interrupt();
    Thread.sleep(10);
    //t.stop = true;
    System.out.println("main " + System.currentTimeMillis());
    System.out.println("main " + System.currentTimeMillis());
    Thread.sleep(10);
  }
}
