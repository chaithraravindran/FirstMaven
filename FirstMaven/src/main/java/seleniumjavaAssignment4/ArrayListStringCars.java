package seleniumjavaAssignment4;

import java.util.ArrayList;

public class ArrayListStringCars {

	public static void main(String[] args) 
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Swift");
		obj.add("Polo");
		obj.add("Tiago");
		obj.add("Ritz");
		obj.add("Seltos");
		obj.add("Baleno");
		System.out.println("The cars are:" +obj);
		if(obj.contains("Ritz")) 
		{
			System.out.println("Present in the list");
		}
		int position=obj.indexOf("Ritz");
		System.out.println("The position of Ritz is:" +position);
	}

}
