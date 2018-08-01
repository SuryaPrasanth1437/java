package program;

import java.util.Scanner;

public class Spilt {

	public static void main(String[] args)
	{
		int n,thousands,hundreds,tens,ones;
		System.out.println("enter the number to be split up");
		Scanner nu=new Scanner(System.in);
		n=nu.nextInt();
		thousands=n/1000;
		n=n%1000;
		hundreds=n/100;
		n=n%100;
		tens=n/10;
		n=n%10;
		ones=n;
		System.out.println("the number of thousands :"+thousands);
		System.out.println("the number of hundreds :"+hundreds);
		System.out.println("the number of tens :"+tens);
		System.out.println("the number of ones :"+ones);
	}

}
