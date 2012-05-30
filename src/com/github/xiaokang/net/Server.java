package com.github.xiaokang.net;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

  /**
   * @param args
   * @throws IOException 
   * @throws InterruptedException 
   */
  public static void main(String[] args) throws IOException, InterruptedException {
    
    if (args == null || args.length < 3) {
      System.err.println("java Server port backlog sleep(sec)");
      System.exit(-1);
    }
    
    int port = Integer.parseInt(args[0]);
    int backlog = Integer.parseInt(args[1]);
    int sleep = Integer.parseInt(args[2]);
    
    ServerSocket server = new ServerSocket(port, backlog);
    System.err.println("Server started on " + server.getInetAddress());
    
    // do not do accept
    
    // sleep 
    Thread.sleep(sleep * 1000);
  }

}
