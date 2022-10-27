
package echoserver;

import java.net.*;
import java.io.*;

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
    
    try { 
      // create a socket to make a connection to the server from the client
      Socket SocketToServer = new Socket(server, PORT_NUMBER);

      // Grab the input stream connected to the output of the client communication socket
      InputStream input = SocketToServer.getInputStream();
      // Grab the output stream connected to the input of the client communication socket
      OutputStream output = SocketToServer.getOutputStream();

      // Create variable to track the bytes being redirected
      int nextByteFromSystem = 0;

      // Reads the stream from the System and puts the stream into the output
      while ((nextByteFromSystem = System.in.read()) != -1) {
        output.write(nextByteFromSystem);
	output.flush();
	System.out.flush();
      }
      SocketToServer.shutdownOutput();

      // Reset variable to track the bytes being redirected
      int nextByteFromOutput = 0;

      // Reads the stream from the System and puts the stream into the output
      while ((nextByteFromOutput = input.read()) != -1) {
        System.out.write(nextByteFromOutput);
	System.out.flush();
      }

    } catch (IOException exception){
      System.out.println("Unexpected exception: "  + exception);
    }
  }  
}

