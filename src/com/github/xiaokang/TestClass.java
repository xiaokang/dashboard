package com.github.xiaokang;

public class TestClass {

  /**
   * @param args
   * @throws ClassNotFoundException 
   */
  public static void main(String[] args) throws ClassNotFoundException {
    ClassLoader loader = TestClass.class.getClassLoader();
    Class a = Class.forName("com.github.xiaokang.TestClass", true, loader);
    Class b = Class.forName("com.github.xiaokang.TestClass", true, loader);
    Class c = Class.forName("java.lang.Integer", true, loader);
    Class d = Class.forName("java.lang.Integer", true, loader);

    System.err.println(a == b);
    System.err.println(c == d);
  }

}
