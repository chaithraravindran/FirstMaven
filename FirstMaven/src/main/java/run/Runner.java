package run;

import java.util.Scanner;

import div.Divi;
import mult.Multiply;
import sub.Subt;

public class Runner 
{
	static Multiply multiply;
	static Divi divi;
	static Subt subt;
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a");
		int a=scan.nextInt();
		System.out.println("Enter b");
		int b=scan.nextInt();
		
		multiply=new Multiply();
		multiply.mul(a,b);
		System.out.println("The result of multiplication is: "+multiply.mul(a,b));
		
		divi=new Divi();
		divi.divide(a,b);
		System.out.println("The result of division is: "+divi.divide(a,b));
		
		subt=new Subt();
		subt.subtract(a,b);
		System.out.println("The result of subtraction is: "+subt.subtract(a,b));

	}

}
