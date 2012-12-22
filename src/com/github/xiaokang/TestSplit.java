package com.github.xiaokang;

public class TestSplit {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String[] splits = "///a/b/c/////".split("/");
    System.err.println(splits.length);
    for(int i = 0; i < splits.length; i++)
      System.err.println("split " + i + " : ##" + splits[i] + "##");
    System.err.println("/default-rack".startsWith(""));
    System.err.println("/default-rack".startsWith("/"));
  }

}
