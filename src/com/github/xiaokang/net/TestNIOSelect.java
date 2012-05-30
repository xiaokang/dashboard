package com.github.xiaokang.net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class TestNIOSelect {

  /**
   * @param args
   * @throws IOException 
   */
  public static void main(String[] args) throws IOException {
    ServerSocketChannel acceptChannel = ServerSocketChannel.open();
    acceptChannel.configureBlocking(false);
    
    String bindAddress = "localhost";
    int port = 8888;
    InetSocketAddress address = new InetSocketAddress(bindAddress, port);
    acceptChannel.socket().bind(address, 1024);
    
    Selector selector = Selector.open();
    acceptChannel.register(selector, SelectionKey.OP_ACCEPT);
    
    for (int i = 0; i < 100; i++) {
      Socket socket = SocketChannel.open().socket();
      socket.setTcpNoDelay(false);
      SocketChannel channel = socket.getChannel();
      channel.configureBlocking(false);
      System.out.println(channel.connect(address));
    }
    
    SelectionKey key = null;
    while (true) {
      System.out.println(selector.select());
      Iterator<SelectionKey> iter = selector.selectedKeys().iterator();
      while (iter.hasNext()) {
        key = iter.next();
        iter.remove();
        try {
          if (key.isValid()) {
            if (key.isAcceptable()) {
              doAccept(key);
            }
          }
        } catch (IOException e) {
          e.printStackTrace(System.err);
        }
        key = null;
      }
    }
  }
  
  public static void doAccept(SelectionKey key) throws IOException {
    ServerSocketChannel server = (ServerSocketChannel) key.channel();
    // accept up to 10 connections
    for (int i=0; i<1000; i++) {
      SocketChannel channel = server.accept();
      if (channel==null) return;
      
      channel.configureBlocking(false);
      channel.socket().setTcpNoDelay(true);
      System.out.println(channel.socket());
    }
  }

}
