package udp;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

import javax.lang.model.element.PackageElement;

public class UdpServe {
public static void main(String[] args) throws Exception {
	DatagramSocket serverSocket=new DatagramSocket(7778);
	
	BufferedOutputStream bos = new BufferedOutputStream(  
			new FileOutputStream(new File("12.jpg"))); 
			byte[] buf = new byte[8119];  
			
			DatagramPacket pkg = new DatagramPacket(buf, buf.length);  					
			serverSocket.receive(pkg);
			int len=0;
			while(len<8){
				len=len+1;
			bos.write(pkg.getData(), 0, len);} 
	
	byte[] buffer=new byte[256];
	DatagramPacket packet=new DatagramPacket(buffer, 256);
	serverSocket.receive(packet);
	
	byte[] recBuffer=Arrays.copyOfRange(packet.getData(), 0, packet.getLength());
	String ip=packet.getAddress().getHostAddress();
	int port=packet.getPort();
	System.out.println(ip+"...."+port);
	String msg=new String(recBuffer,"gbk");
	System.out.println(msg);
	
	
	byte[] sendBuffer="i recived".getBytes();
	DatagramPacket sendpacket=new DatagramPacket(sendBuffer, sendBuffer.length);
	sendpacket.setPort(port);
	sendpacket.setAddress(packet.getAddress());
	serverSocket.send(sendpacket);
	serverSocket.close();
}
}
