import java.net.DatagramPacket;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class testsoc {
	public static void main( String[] args ) throws IOException {
		DatagramSocket clientsoc;
		clientsoc = new DatagramSocket();
		InetAddress ip = InetAddress.getByName("15.206.88.194");
		// This is the cool part like in c the inet addr is still inet addr only thing to remember is GetByName there is also getlocalhost

		String msg = "Hello";
		// Need to change this to read from command line argument

		byte buf[] = null; // This is how you create a byte array of an undefined size, I wonder why you dont have to memset it


		buf = msg.getBytes();
		// converting a string to bytes is done like so

		DatagramPacket dpp = new DatagramPacket( buf, buf.length, ip, 5001);
		// ok so in java there is no sendto function the address is figured out by the DAtagram Packet class, also the port which I am hard coding in for now
		try {
			clientsoc.send(dpp);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		// And its as easy as that to send the msg
	}
}
