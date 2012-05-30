package com.github.xiaokang;

public class TestFinally {

  /**
   * @param args
   */
  public static void main(String[] args) {
    try {
      String l = null;
      l.length();
    } finally {
      System.err.println();
    }

  }

}
