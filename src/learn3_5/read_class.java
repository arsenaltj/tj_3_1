package learn3_5;
import java.io.FileInputStream;
import java.io.InputStream;
public class read_class {
      public static void main(String[] args) throws Exception{
		InputStream in=new FileInputStream("db.txt");
		int m = 0;
		while ((m=in.read())!=1) {
			System.out.println((char)m);
			
		}
	  byte[] buffer=new byte[2];
	  int n=0;
	  while ((n=in.read(buffer))!=-1) {
		  for(byte b:buffer){
			  System.out.println(n);
		  }
	}
 	}
      
}
