import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

	}

	private int port;

	public Server(int port) {
		super();
		this.port = port;
	}
public void startListening() {
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
			ServerSocket serverSocket = new ServerSocket(port);
			Socket remoteClientSocket = serverSocket.accept();
			
			Scanner scan = new Scanner(new Buffered Reader(new InputStreamReader(remoteClientSocket.getInputStream())))
			if(s.)
			}
			}

		}
	})
	
}
}