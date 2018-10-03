package Simple_programs;

public class pattern5 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			int n = 3;
			for(int j=1;j<=n-i;j++) {
				System.out.println(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.println(k);
			}
			for(int l=2;l<=i;l++) {
				System.out.println(l);
			}
			System.out.println();
		}
		
	}
}
