package applet;

public class thread_sleep extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);

			
			for (char j = 'a'; j <= 'e'; j++) {
				System.out.println(j);
				
				  try { Thread.sleep(2000); } catch (InterruptedException e) {
				  
				  }
				  break;
				 
			}
			
		}
	
	}

	public static void main(String[] args) throws InterruptedException {

		thread_sleep ts = new thread_sleep();
		thread_sleep ts1 = new thread_sleep();
		ts.start();
	    ts1.start();
				

	}

}
