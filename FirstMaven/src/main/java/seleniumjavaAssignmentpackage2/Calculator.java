package seleniumjavaAssignmentpackage2;
import seleniumjavaAssignmentpackage1.Processor;

public class Calculator 
{
	
	public static void main(String[] args) 
	{
		Processor obj=new Processor();
		boolean status=obj.check(51);
		
		System.out.println("The status of the number:" +status);
		
	}
}
