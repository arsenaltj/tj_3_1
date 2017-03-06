package udp;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class UdpClient {
	public static void main(String[] args) throws Exception {
		String SendInfo = "i am arsenal";
		InputStream fin = new FileInputStream(new File("1.jpg"));
		byte[] buffer = new byte[8119];
		int c = fin.read(buffer);
		
		DatagramPacket dp = new DatagramPacket(buffer, c);

		DatagramPacket packet = new DatagramPacket(SendInfo.getBytes("gbk"), SendInfo.length());
		packet.setPort(7778);
		dp.setPort(7778);
		InetAddress address = InetAddress.getByName("192.168.2.149");
		packet.setAddress(address);
		dp.setAddress(address);
		DatagramSocket socket = new DatagramSocket();
		socket.send(dp);
		socket.send(packet);
		DatagramPacket recPacket = new DatagramPacket(new byte[256], 256);
		socket.receive(recPacket);
		System.out.println(new String(recPacket.getData(), "gbk"));
		socket.close();
	}
}
