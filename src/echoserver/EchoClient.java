package echoserver;

import java.net.*;
import java.io*;

public class EchoClient {

  public static final int PORT_NUMBER = 6013;
  
  public static void main(String[] args) {
  
    // If a server is taken as an argument, then us that server. Otherwise, default server is 127.0.0.1
    String server;
    if (args.length == 0) {
      server = "127.0.0.1";
    } else {
      server = args[0];
    }

  }  
}
