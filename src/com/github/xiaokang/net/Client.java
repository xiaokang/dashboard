package com.github.xiaokang.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Date;

public class Client {

  /**
   * @param args
   * @throws IOException 
   */
  public static void main(String[] args) throws IOException {
    if (args == null || args.length < 4) {
      System.err.println("usage : java Client hostname port sotimeout cotimeout");
      System.exit(-1);
    }
    String hostname = args[0];
    int port = Integer.parseInt(args[1]);
    int soTimeout = Integer.parseInt(args[2]);
    int coTimeout = Integer.parseInt(args[2]);
    
    // connect
    InetSocketAddress server = new InetSocketAddress(hostname, port);
    Socket socket = new Socket();
    socket.setSoTimeout(soTimeout);
    socket.setTcpNoDelay(true);
    System.err.print("[ " + System.currentTimeMillis() + " ] ");
    System.err.println("Client : " + socket + " try to connect"); 
    try {
      socket.connect(server, coTimeout);
    } catch (IOException e) {
      System.err.print("[ " + System.currentTimeMillis() + " ] ");
      e.printStackTrace(System.err);
      throw e;
    }
    System.err.print("[ " + System.currentTimeMillis() + " ] ");
    System.err.println("Client : " + socket + " connect successfully");    
    
    // get input output stream
    InputStream in = socket.getInputStream();
    OutputStream out = socket.getOutputStream();
    
    // write one byte 0
    out.write(0);
    out.flush();
    
    System.err.print("[ " + System.currentTimeMillis() + " ] ");
    System.err.println("Client : " + socket + " wirte successfully");
    
    // read one byte
    try {
      in.read();
    } catch (IOException e) {
      System.err.print("[ " + System.currentTimeMillis() + " ] ");
      e.printStackTrace(System.err);
      throw e;
    }
    System.err.print("[ " + System.currentTimeMillis() + " ] ");
    System.err.println("Client : " + socket + " read successfully");
  }

}
