package com.github.xiaokang;

public class TestLong {

  /**
   * @param args
   */
  public static void main(String[] args) {
    long size = 2597837L;
    short rep = 3;
    long dsDelta = size * rep;
    System.err.println("size = " + size + ", rep = " + rep + ", ds = " + dsDelta);
    System.err.println("dsDelta > 0 : " + (dsDelta>0));

  }

}
