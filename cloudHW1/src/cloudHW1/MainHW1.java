package cloudHW1;

import java.lang.Math;
import java.util.Scanner;

public class MainHW1
{	
	public static void main(String[] args) 
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Compound Interest Calculator\n----------------------------");
		System.out.println("P: Present Value (starting amount)\nR: Interest Rate (decimal)\nN: Number of Compounding Periods\nT: Amount of Time (years)");
		System.out.println("Enter Present Value: ");
		double P = scan1.nextDouble();
		System.out.println("Enter Interest Rate (%): ");
		double r = scan1.nextDouble()/100;
		System.out.println("Enter Number of Compounding Periods: ");
		double n = scan1.nextDouble();
		System.out.println("Enter Amount of Time (years): ");
		double t = scan1.nextDouble();
		System.out.println("\n----------------------------\n");
		double F = P * Math.pow((1 + r/n), n*t);
		System.out.printf("Future Amount = %.2f",F);
	}
	
}
