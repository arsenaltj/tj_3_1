package learn3_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws Exception{
		ServerSocket server=new ServerSocket(8883);
		while(true){
			Socket socket=null;
			socket=server.accept();
			OutputStream out=socket.getOutputStream();
			InputStream  in=socket.getInputStream();
			BufferedReader reader=new BufferedReader(new InputStreamReader(in));
			System.out.println("s1");
			out.write("please input your encodding\n:".getBytes());
			System.out.println("s2");
			String encodding=reader.readLine();
			System.out.println("s3");
			
			out.write("Hello I am ºÚ¿ÍµÛ¹ú!".getBytes(encodding));
			out.close();
			socket.close();
		}
		//server.close();
		
		
		
		
		
		

	}

}
