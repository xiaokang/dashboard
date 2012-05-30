package com.github.xiaokang;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
  
  static class Number {
    public int n;
    
    public Number(int n) {
      this.n = n;
    }
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    TreeSet<Number> set = new TreeSet<Number>(
        new Comparator<Number>() {
          @Override
          public int compare(Number o1, Number o2) {
            return o1.n - o2.n;
          }
        }
    );
    set.add(new Number(3));
    set.add(new Number(4));
    set.add(new Number(2));
    set.add(new Number(5));
    set.add(new Number(8));
    set.add(new Number(4));
    set.add(new Number(9));
    System.err.println("set size " + set.size());
    Number first = set.first();
    System.err.println("set first " + first.n);
    Number first2 = set.pollFirst();
    System.err.println("set first " + first2.n + " " + (first == first2));
    
    
    set.add(first);
    System.err.println("set size " + set.size());
    first.n = 10;
    first = set.first();
    System.err.println("set first " + first.n);
    System.err.println("remove first " + set.remove(first));
    System.err.println("set size " + set.size());
    first2 = set.pollFirst();
    System.err.println("set size " + set.size());
    System.err.println("set first " + first2.n + " " + (first == first2));
  }

}
