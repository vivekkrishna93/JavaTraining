package applet;

public class main_thread extends Thread {
	char i ;
	 
	public void run() {
		for(i='a';i<'e';i++)
		{
			System.out.println(i);
		
		}
      
	}

	public static void main(String[] args) {
		main_thread m1 = new main_thread();
		m1.start();

	}

}
