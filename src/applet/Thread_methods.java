package applet;

public class Thread_methods extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread name" + Thread.currentThread().getName());
			System.out.println("Thread id" + Thread.currentThread().getId());
			System.out.println(i);

		}
		for (char j = 'a'; j <= 'e'; j++) {
			System.out.println("Thread name :" + Thread.currentThread().getName());
			System.out.println("Thread id :" + Thread.currentThread().getId());
			System.out.println(j);
		}
	}

	public static void main(String args[]) throws InterruptedException {
		Thread_methods t1 = new Thread_methods();
		Thread_methods t2 = new Thread_methods();
		Thread_methods t3 = new Thread_methods();
		t1.start();
		t1.sleep(2000);

		t2.start();
		t2.yield();
        t1.isAlive();
		t1.suspend();
		t3.start();

		t1.resume();
		t2.resume();
	}

}
