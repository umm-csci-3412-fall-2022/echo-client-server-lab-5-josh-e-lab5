package echoserver;

public class EchoServer {

  final public static int PORT_NUMBER = 6013;

  public static main(String[] args) {
  
    try {
      // Create a server socket for communication link between client and server
      ServerSocket socket = new ServerSocket(PORT_NUMBER);

      while(true) {
	// Create the socket to communicate between server and client
        Socket clientSocketConnection = serverSocket.accept();

      }
    }
  }
}
