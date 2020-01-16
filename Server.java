import java.io.*;
import java.net.*;

public class Server {
	
	public static void main(String[] args) {
		new Server().start();
	}

	public void start() {
		try {
			ServerSocket ss = new ServerSocket(0000);
			while(true) {
				Socket socket = ss.accept();
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println("articuno");
				pw.close();
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
