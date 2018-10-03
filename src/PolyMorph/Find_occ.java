package PolyMorph;

import java.util.Scanner;

public class Find_occ {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String input= sc.nextLine();
		System.out.println("Enter the occurence to be found");
		char find= sc.nextLine().charAt(0);
		int counter=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==find)
			{
				counter++;
			}
		}
		
		System.out.println("number of occurence of"+find+counter);
	}

}
