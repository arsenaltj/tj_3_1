package learn3_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.jar.Attributes.Name;


public class file_test {
public static void main(String[] args) throws Exception{
	creat(null);
	ShowList();
//	Delete("2.pptx");
//	ShowList();
//	File f=new File("test1/db.txt");
//	String[] fs=f.list();
//	f.delete();
//	for(String fileName:fs){
//		System.out.println(fileName);
}
	public static void ShowList() throws IOException {
		
		File f=new File("test1");
		String[] fs=f.list();
		for (String f1 : fs) {
			System.out.println(f1);
			
		}
	}
   public static void Delete(String name) {
	   
		File f=new File("test1/"+name);
		f.delete();	
		
}
   public static void creat(String name) throws Exception {
		File f=new File("test1/"+name);
       f.createNewFile();
}
}


