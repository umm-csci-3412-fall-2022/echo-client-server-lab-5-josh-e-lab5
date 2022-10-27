package echoserver;

public class EchoServer {

  final public static int PORT_NUMBER = 6013;

  public static void main(String[] args) {
  
    try {
      // Create a server socket for communication link between client and server
      ServerSocket socket = new ServerSocket(PORT_NUMBER);

      while(true) {
	// Create the socket to communicate between server and client
        Socket clientSocketConnection = serverSocket.accept();

	// Grab the input stream connected to the output of the client communication socket
	InputStream input = clientSocketConnection.getInputStream();
	// Grab the output stream connected to the input of the client communication socket
	OutputStream output = clientSocketConnection.getOutputStream();

	// Reads the input stream and puts the stream into the output
	input.transferTo(output);

	input.close();
	output.close();
	clientSocketConnection.close();
      }
    }
  }
}
