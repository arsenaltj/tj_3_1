package ftp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FtpClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Socket socket=new Socket("127.0.0.1", 6666);
		InputStream nin = socket.getInputStream();
		OutputStream fout = new FileOutputStream("recive.txt");
		byte[] buffer = new byte[256];
		int len=0;
		while((len=nin.read(buffer))!=-1){
			fout.write(buffer, 0, len);
		}
          socket.close();
          nin.close();
          fout.close();
	}

}
