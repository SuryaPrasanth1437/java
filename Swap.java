package program;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args)
	{
	int a,b, temp;
	Scanner n=new Scanner(System.in);
	System.out.println("enter the values of a and b");
	a=n.nextInt();
	b=n.nextInt();
	System.out.println("before swapping");
	System.out.println("value of a is"+a);
	System.out.println("value of b is "+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping");
	System.out.println("value of a is"+a);
	System.out.println("value of b is"+b);
	}

}
