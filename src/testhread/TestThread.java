package testhread;

import org.junit.experimental.theories.Theories;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for (int i = 0; i < 1000; i++) {
    	 if (i==100) {
			new Thread(){
				public void run() {
					for (int j = 0; j < 1000; j++) {
						System.out.println(Thread.currentThread().getName()+"...."+j);

					}
				};
			}.start();
		}
		System.out.println(Thread.currentThread().getName()+"....."+i);
	}
	}

}

