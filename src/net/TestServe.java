package net;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import learn3_5.file_test;

public class TestServe extends file_test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ServerSocket server = new ServerSocket(8886);
		boolean a = true;
		while (true) {
			Socket socket = null;
			socket = server.accept();
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			out.write("%10s you can input:".getBytes());
			out.write("'ls' to show filelist\n".getBytes());
			out.write("'rm' to delete\n".getBytes());
			out.write("'bye' to exit....\n".getBytes());
			out.write("'wr' to create....\n".getBytes());
			out.write("please input your order\n:".getBytes());

			// for(int i=0;i<100;i++){
			while (a) {
				String encodding = reader.readLine();
				System.out.println(encodding);
				switch (encodding) {

				case "ls":
					// ShowList();
					File f = new File("test1");
					String[] fs = f.list();
					for (String f1 : fs) {
						System.out.println(f1);
						out.write("......\n".getBytes());
						out.write(f1.getBytes());
					}

					break;
				case "rm":
					out.write("input the filename what you want delete\n".getBytes());
					String filename = reader.readLine();
					Delete(filename);
					out.write("\n delete success".getBytes());
					break;
				case "bye":
					out.write("\n byebye".getBytes());
					a = false;
					out.write("\n closing".getBytes());
					out.close();
					// socket.close();
					// server.close();

					break;
				case "wr":
					out.write("input the filename what you want to creat\n".getBytes());
					String filename1 = reader.readLine();
					creat(filename1);
					out.write("\n create success".getBytes());
					break;
				default:
					System.out.println("please retry");
					out.write("\n please retry".getBytes());

					break;
				}
			}
			// if(encodding.equals("rm")){
			// System.out.println("É¾³ýÖÐ");
			// file_test.main(args);
			// System.out.println("ÒÑÉ¾³ý");
			// }
			// else{
			// System.out.println("111");
			// }
			// out.write("hello i am °¢É­ÄÉ".getBytes(encodding));

			out.close();
			socket.close();
			a = true;
		}
		// server.close();

	}

	public static void download(String filename) throws Exception {

		Socket socket = new Socket("127.0.0.1", 5555);
		InputStream nin = socket.getInputStream();
		OutputStream fout = new FileOutputStream("filename");
		byte[] buffer = new byte[256];
		int len = 0;
		while ((len = nin.read(buffer)) != -1) {
			fout.write(buffer, 0, len);
		}
		nin.close();
		fout.close();
		// socket.close();

	}

	private static void upload(String filename) throws Exception {

		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(6666);
		Socket socket = server.accept();
		InputStream fin = new FileInputStream("filename");
		OutputStream nout = socket.getOutputStream();
		byte[] buffer = new byte[256];
		int len = 0;
		while ((len = fin.read(buffer)) != -1) {
			nout.write(buffer, 0, len);
		}
		socket.close();
		fin.close();
		nout.close();

	}
}
