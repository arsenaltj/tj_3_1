import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test_read_write {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException {
    byte[] bs=new byte[2];
    int m =System.in.read(bs);
    for (byte b : bs) {
		System.out.println(b);
	}
   
	}
	 public void test1() throws Exception{
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 while (true) {
			System.out.println("name:\n");
			String line = reader.readLine();
			if("bye".equals(line)){
				break;
			}
			System.out.println(line);
		}
	    	reader.close();
	    }

}
