package com.github.xiaokang;

public class TestSyncOverhead {

  static class Getter {
    int n = 100;
    
    public synchronized int getSync() {
      return n;
    }
    
    public int getNosync() {
      return n;
    }
  }
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    
    Getter getter = new Getter();
    
    long time = 0;
    long start = 0;
    
    start = System.currentTimeMillis();
    for (int i = 0; i < n; i++) {
      getter.getSync();
    }
    time = System.currentTimeMillis() - start;
    System.err.println("getSync " + n + " times use " + time + " ms");

    start = System.currentTimeMillis();
    for (int i = 0; i < n; i++) {
      getter.getNosync();
    }
    time = System.currentTimeMillis() - start;
    System.err.println("getNosync " + n + " times use " + time + " ms");
    
  }

}
