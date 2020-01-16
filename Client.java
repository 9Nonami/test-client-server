import java.io.*;
import java.net.*;

public class Client {
	
	public static void main(String[] args) {
		new Client();
	}

	public Client() {
		try {
			Socket socket = new Socket("", 0000);
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			System.out.println(s);
			isr.close();
		} catch(Exception ex) {
			ex.printStackTrace();
		}	
	}

}
