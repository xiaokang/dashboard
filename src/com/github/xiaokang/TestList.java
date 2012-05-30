package com.github.xiaokang;

import java.util.LinkedList;

public class TestList {

  /**
   * @param args
   */
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    for (int i = 0; i < 10; i++)
      list.add(i);

    for (Integer i : list) {
      System.err.println(i);
    }

    System.err.println(list);

    for (Integer i : list) {
      if (i % 2 == 0)
        list.remove(i);
    }

    for (Integer i : list) {
      System.err.println(i);
    }

    System.err.println(list);
  }

}
