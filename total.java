package program;

import java.util.Scanner;

public class Total {

	public static void main(String[] args) 
	{
	 float average;
	 int s1,s2,s3,s4,s5,total;
	 Scanner t=new Scanner(System.in);
	 System.out.println("enter the five subject mark");
	 s1=t.nextInt();
	 s2=t.nextInt();
	 s3=t.nextInt();
	 s4=t.nextInt();
	 s5=t.nextInt();
	 total=s1+s2+s3+s4+s5;
	 average = total/5;
	 System.out.println("total of five subject maark are"+total);
	 System.out.println("the average of five subject marks are"+average);
	}

}
