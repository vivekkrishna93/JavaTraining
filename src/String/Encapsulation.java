package String;

public class Encapsulation {
	private String name;
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name=name;
	}
	public static void main(String args[])
	{
		Encapsulation e= new Encapsulation();
		e.setname("vivek");
		System.out.println(e.getname());
	}
}
