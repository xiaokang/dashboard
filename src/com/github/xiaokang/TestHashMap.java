package com.github.xiaokang;

import java.util.HashMap;
import java.util.Random;

public class TestHashMap {

  /**
   * 
   * 测试规模扩大的时候，hashmap的性能变化
   * 
   * 100w, 1000w, 1y
   * 
   * get(), put(), remove()
   * 
   * @param args
   */
  public static void main(String[] args) {
    
    if (args == null || args.length < 4) {
      System.err.println("usage : TestHashMap <nBase> <nGet> <nPut> <nRemove>");
      return;
    }
    
    int nBase = Integer.parseInt(args[0]);
    int nGet = Integer.parseInt(args[1]);
    int nPut = Integer.parseInt(args[2]);
    int nRemove = Integer.parseInt(args[3]);
    
    Random rand = new Random();
    
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    long start, end;
    
    println("Preparing hashmap of size : " + nBase);
    start = System.currentTimeMillis();
    for (int i = 0; i < nBase; i++) {
      Integer r = i;
      map.put(r, r);
    }
    end = System.currentTimeMillis();
    println("used " + (end - start) + " ms, " + nBase/(end -start) + " ops");
    
    println("Geting " + nGet);
    start = System.currentTimeMillis();
    for (int i = 0; i < nGet; i++) {
      Integer r = rand.nextInt(nBase);
      map.get(r);
    }
    end = System.currentTimeMillis();
    println("used " + (end - start) + " ms, " + nGet/(end -start) + " ops");
    
    println("Puting " + nPut);
    start = System.currentTimeMillis();
    for (int i = 0; i < nPut; i++) {
      Integer r = rand.nextInt() + nBase;
      map.put(r, r);
    }
    end = System.currentTimeMillis();
    println("used " + (end - start) + " ms, " + nPut/(end -start) + " ops");
    
    println("Removing " + nRemove);
    start = System.currentTimeMillis();
    for (int i = 0; i < nRemove; i++) {
      Integer r = rand.nextInt(nBase);
      map.remove(r);
    }
    end = System.currentTimeMillis();
    println("used " + (end - start) + " ms, " + nRemove/(end -start) + " ops");
    
  }
  
  public static void println(String s) {
    System.err.println(s);
  }

}
