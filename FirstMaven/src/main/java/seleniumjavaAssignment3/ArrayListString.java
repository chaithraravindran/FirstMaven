package seleniumjavaAssignment3;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;

public class ArrayListString 
{

	public static void main(String[] args) throws AWTException 
	{
		//Robot obj1=new Robot(); Robot class
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Pineapple");
		obj.add("Strawberry");
		System.out.println("The Strings added are:" +obj);
		for(String i:obj)
		{
			System.out.println("The String is:" +i);
		}
	}

}
