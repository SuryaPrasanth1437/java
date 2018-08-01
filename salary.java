package program;

import java.util.Scanner;

public class Salary 
{

	public static void main(String[] args) 
	{
		double b_salary,net_salary,t_reduction,hra,da,cca,ea=75,pf,lic=100,gross_salary;
		System.out.println("enter your basic salary");
		Scanner sa=new Scanner(System.in);
		b_salary=sa.nextDouble();
		da=b_salary*57/100;
		cca=b_salary*1/5;
		hra=b_salary*5/100;
		gross_salary=hra+da+cca+ea+b_salary;
		pf=b_salary*8.5/100;
		t_reduction=pf+lic;
		net_salary=gross_salary-t_reduction;
		System.out.println("basic salary is "+b_salary);
		System.out.println("gross salary is "+gross_salary);
		System.out.println("the total reduction is "+t_reduction);
		System.out.println("the net salary is "+net_salary);

	}

}
