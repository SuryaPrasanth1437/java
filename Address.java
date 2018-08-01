package program;

import java.util.Scanner;

public class Address {

	public static void main(String[] args) 
	{
		String district,s_name, a_name;
		Scanner ad=new Scanner(System.in);
		System.out.println("enter your street name");
		s_name=ad.nextLine();
		System.out.println("enter your area name");
		a_name=ad.nextLine();
		System.out.println("enter the district name");
		district=ad.nextLine();
		System.out.println("address :");
		System.out.println(s_name+",\n"+a_name+",\n"+district+".");
	}

}
