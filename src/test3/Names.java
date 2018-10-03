package test3;

class studentname {
	int id;
	String name;

	public studentname(int id, String name) {

		id = id;
		name = name;
		System.out.println("" + id + " " + name);
	}

	public studentname() {

	}

}

public class Names {
	public static void main(String args[]) {
		studentname[] studentarry;
		studentarry = new studentname[5];
		studentarry[0] = new studentname(1, "vivek");
		studentarry[1] = new studentname(2, "krishna");
		studentarry[2] = new studentname(3, "naveen");

	}

}
