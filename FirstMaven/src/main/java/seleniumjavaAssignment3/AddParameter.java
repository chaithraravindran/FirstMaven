package seleniumjavaAssignment3;

public class AddParameter 
{

	public static void main(String[] args) 
	{
		int x=AddParameter.add(10,8);
		System.out.println("The sum is:"+x);
		float y=AddParameter.total(50,100);
		System.out.println("The total marks is:" +y);
		
	}
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static float total(int mark,int sumTotal)
	{
		float percentage=(float)mark/sumTotal*100;
		return percentage;
	}

}
