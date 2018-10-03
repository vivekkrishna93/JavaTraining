package Thread_sync;

public class sync_connect {
	detail dt = new detail();
	Salary s1 = new Salary();

	public synchronized void detail(int id, String name, double sal) {
		dt.setName(name);
		dt.setId(id);
		s1.setSal(sal);
		System.out.print(" " + id);
		System.out.print(" " + name);
		System.out.print(" " + sal);

	}

}
