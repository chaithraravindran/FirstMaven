package seleniumjavaAssignment3;

public class Percentage {
	
		
	public static void main(String[] args) 
	{
		int x=Percentage.totalMarks(50,100);
		System.out.println("The percentage of mark scored is:" +x);
		
		
		
	}
	public static int totalMarks(int marks,int total)
	{
		
		int percent=((marks/total)*100);
		return percent;
	}

}
