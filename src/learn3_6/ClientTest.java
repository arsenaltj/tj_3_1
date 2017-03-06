package learn3_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest {
	public static void main(String[] args) throws Exception {
//		String encodding = System.getProperty("sun.jun.encoding");
//		Socket socket = new Socket("127.0.0.1", 8886);
//		InputStream in = socket.getInputStream();
//		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//		OutputStream out = socket.getOutputStream();
//
//		String tip = reader.readLine();
//		System.out.println(tip);
//		out.write((encodding + "\n").getBytes());
//		String info = reader.readLine();
//		System.out.println(info);
//		out.close();
//		reader.close();
//		socket.close();
		String encodding=System.getProperty("sun.jnu.encoding");
		Socket socket=new Socket("127.0.0.1", 8883);
		InputStream in=socket.getInputStream();
		
		System.out.println("1");
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(in));
		OutputStream out=socket.getOutputStream();
		System.out.println("2");
		String tip=reader.readLine();
		System.out.println(tip);
		System.out.println("3");
		out.write((encodding+"\n").getBytes());
		String info=reader.readLine();
		System.out.println(info);
		out.close();
		reader.close();
		socket.close();

	}
}
