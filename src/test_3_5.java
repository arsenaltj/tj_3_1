import static org.junit.Assert.*;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.stream.FileImageInputStream;
import javax.transaction.xa.XAException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test_3_5 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
		assertArrayEquals(1, 1);
	}

	private void assertArrayEquals(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception{
		InputStream in= new FileInputStream("db.txt");
		int m = 0;
		while ((m=in.read())!=-1) {
        System.out.println(m);			
		}
		fail("Not yet implemented");
	}
	@Test
	public void test1() throws Exception{
		InputStream in = new FileInputStream("db.txt");
		int m = 0;
		byte[] buffer = new byte[3];
		while ((m=in.read(buffer))!=-1) {
			for(byte b:buffer){
				  System.out.println(m);
			
		}
	}

}
	@Test
	public void test2() throws Exception{
		// TODO Auto-generated method stub
        InputStream in=new FileInputStream("db2.txt");
        byte[] buffer=new byte[2];
        int m=0;
        while ((m=in.read(buffer))!=-1) {
        	String a=new String(buffer,"GBK");
        	System.out.println(a);
			
		}
	}
  @Test
  public void test5() throws Exception{
	  OutputStream out = new FileOutputStream("db3.txt");
	  for (int i = 97; i < 122; i++) {
		  out.write(i);
		
	}
	  out.close();
  }
  @Test
  public void test6() throws Exception{
	  OutputStream out = new FileOutputStream("db3.txt");
	  String s="ÄãºÃ°¡";
	  byte[] ca=s.getBytes("gbk");
//	  OutputStream ca1 = new FileOutputStream("db3.txt");
//	  for (int i = 97; i < 122; i++) {
		  out.write(ca);
		
	//}
	  out.close();
  }
  @Test
  public void test8()throws Exception{
	  long start = System.currentTimeMillis();
	  byte[] buffer = new byte[128];
	  int m=0;
	  InputStream in=new FileInputStream("2.pptx");
	  OutputStream out = new FileOutputStream("1.pptx");
	  while ((m=in.read(buffer))!=-1) {
		  out.write(buffer);		
	}
	  in.close();
	  out.close();
	  long end =System.currentTimeMillis();
			  System.out.println(end-start);
  }
  @Test
  public void test9() throws Exception{
     DataInputStream din= new DataInputStream(new FileInputStream("db.inf"));
     double d=din.readDouble();
     float m=din.readFloat();
     System.out.println(d);
     System.out.println(m);
     din.close();
  }
  @Test
  public void test11() throws Exception{
	  long start = System.currentTimeMillis();
	  byte[] buffer = new byte[128];
	  DataOutputStream out = new DataOutputStream(new FileOutputStream("db.txt"));
	  double[] a1 = new double[100];
	  for(int j=0;j<10000;j++){
	  for(int i=0;i<100;i++){ 
			double a;
			a=(double) (Math.random()*10000)+10000;
		    a1[i]=a;
		    out.writeDouble(a1[i]);
		} 
	  
	  }
	  long end =System.currentTimeMillis();
	  System.out.println(end-start);
  }
}

