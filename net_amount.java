package program;

import java.util.Scanner;

public class Net_amount {

	public static void main(String[] args) 
	{
		double ds,net_amount,s_amount;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the sales amount");
		s_amount=s.nextInt();
		ds=s_amount*3.5/100;
		net_amount=s_amount+ds;
		System.out.println("the sales amount is "+s_amount);
		System.out.println("the net amount is "+net_amount);

	}

}
