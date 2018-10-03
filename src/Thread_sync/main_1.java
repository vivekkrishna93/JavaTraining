package Thread_sync;

class call_1 extends Thread {
	sync_connect s1 = new sync_connect();

	public void run() {
		s1.detail(1, "a", 20000);
		s1.detail(2, "b", 30000);
		s1.detail(3, "c", 40000);
		s1.detail(4, "d", 50000);

	}

}

class call_2 extends Thread {
	sync_connect s2 = new sync_connect();

	public void run() {
		s2.detail(5, "e", 60000);
		s2.detail(6, "f", 70000);
		s2.detail(7, "g", 80000);
		s2.detail(8, "h", 90000);

	}

}

public class main_1 {
	public static void main(String args[]) {

		call_1 c1 = new call_1();
		call_2 c2 = new call_2();
		call_2 c3 = new call_2();
		c1.start();
		c2.start();
		//c3.start();
		
	}

}
