package learn3_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class read_write {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       test1();
	}
	public static void test1() throws Exception{
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
