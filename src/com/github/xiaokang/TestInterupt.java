package com.github.xiaokang;

import java.io.IOException;
import java.util.Date;

public class TestInterupt {

  static class ReadThread extends Thread {
    boolean running = false;
    
    public void run() {
      try {
        running = true;
        System.in.read();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  /**
   * @param args
   */
  public static void main(String[] args) {
    ReadThread reader = new ReadThread();
    reader.start();
    while(!reader.running){
      // wait
    }
    System.err.println("" + new Date() + " interrupt");
    System.err.println(reader.isInterrupted());
    reader.interrupt();
    System.err.println("" + new Date() + " interrupted");
    System.err.println(reader.isInterrupted());
  }

}
