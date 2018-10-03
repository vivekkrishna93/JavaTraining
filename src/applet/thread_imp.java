package applet;

public class thread_imp implements Runnable {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
             try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_imp t1= new thread_imp();
		Thread t= new Thread(t1);
		t.start();
		t.suspend();
		t.resume();

	}

}
