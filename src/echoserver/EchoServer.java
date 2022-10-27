
package echoserver;

import java.net.*;
import java.io.*;

public class EchoServer {

  final public static int PORT_NUMBER = 6013;

  public static void main(String[] args) {
  
    try {
      // Create a server socket for communication link between client and server
      ServerSocket serverSocket = new ServerSocket(PORT_NUMBER);

      while(true) {
	// Create the socket to communicate between server and client
        Socket clientSocketConnection = serverSocket.accept();

	// Grab the input stream connected to the output of the client communication socket
	InputStream input = clientSocketConnection.getInputStream();
	// Grab the output stream connected to the input of the client communication socket
	OutputStream output = clientSocketConnection.getOutputStream();

	// Create variable to track the bytes being redirected
	int NextByte = 0;

	// Reads the input stream and puts the stream into the output
	while ((NextByte = input.read()) != -1) {
	  output.write(NextByte);
	  output.flush();
	}
	
	// Close the Communications between Server and Client
	input.close();
	output.close();
	clientSocketConnection.close();
      }
    } catch (IOException exception) {
	// Print out exception error if caught exception
        System.err.println("Exception caught: " + exception);
    }
  }
}


