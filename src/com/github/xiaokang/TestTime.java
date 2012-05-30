package com.github.xiaokang;

public class TestTime {

  /**
   * @param args
   * @throws InterruptedException 
   */
  public static void main(String[] args) throws InterruptedException {
    long ms = System.currentTimeMillis();
    long ns = System.nanoTime();
    
    Thread.sleep(100);
    ms = System.currentTimeMillis() - ms;
    ns = System.nanoTime() - ns;
    System.err.println("ms  = " + ms + ", ns  = " + ns);
    System.exit(0);
    for(int i = 0; i < 1000000000; i++){
      System.currentTimeMillis();
      //System.nanoTime();
    }
    long ms1 = System.currentTimeMillis();
    long ns1 = System.nanoTime();
    System.err.println("ms1 = " + ms1 + ", ns1 = " + ns1);
    System.err.println("ms1 - ms = " + (ms1 -ms) + "ns1 - ns = " + (ns1 - ns));
  }

}
