package ftp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FtpServe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   ServerSocket server=new ServerSocket(6666);
   Socket socket=server.accept();
   InputStream fin=new FileInputStream("test1.txt");
   OutputStream nout =socket.getOutputStream();
   byte[] buffer = new byte[256];
   int len=0;
   while((len=fin.read(buffer))!=-1){
   nout.write(buffer,0,len);
   }
    socket.close();
    fin.close();
    nout.close();
   
   
	}

}
