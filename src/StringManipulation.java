
public class StringManipulation {

	public static void main(String[] args) {
		String name="Fujitsu";
		if(name.equals("Fujitsu")){
			System.out.println("Verified");
		}
		else {
			System.out.println("Wrong");
		}
		if (name == "Fujitsu"){
			System.out.println("OK");
		}
		else {
			System.out.println("Not OK");
		}
		char n1= name.charAt(0);
		System.out.println(n1);
		int n2 = name.indexOf('F');
		System.out.println(n2);
		if(name.contains("A")) {
			System.out.println("DONE");
		}
		else {
			System.out.println("POOR");
		}
		if(name.equalsIgnoreCase("fUJITSU"))
		{
			System.out.println("YESSSSSS.!");
		}
		else
		{
			System.out.println("NOOOOOOOO:(");
		}
		String replace = name.replace('F', 'a');
		System.out.println("Replaced " + replace );
		String replaceAll = name.replaceAll(name, "Wipro");
		System.out.println(replaceAll);
	}

}
