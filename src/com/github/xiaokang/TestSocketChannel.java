package com.github.xiaokang;

import java.io.IOException;
import java.nio.channels.SocketChannel;

public class TestSocketChannel {

  /**
   * @param args
   * @throws IOException 
   */
  public static void main(String[] args) throws IOException {
    SocketChannel ch1 = SocketChannel.open();
    SocketChannel ch2 = SocketChannel.open();
    System.err.println(ch1 == ch2);
    System.err.println(ch1.equals(ch2));
    System.err.println(ch1.socket().getChannel() == ch2.socket().getChannel());
    System.err.println(ch1.socket().getChannel().equals(ch2.socket().getChannel()));
  }

}
