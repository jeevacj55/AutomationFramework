package practice;

public class GenericMethodPractice {

	public static void main(String[] args)
	{
		int sum=add(20,10);
		System.out.println(sum);
		System.out.println(add(sum,sum));
		
		add(2,3,6);
		
		

	}
	public static int add(int a, int b)
	{
		int c = a+b;
		return c;
	}

	public static int add(int a, int b, int s)
	{
		int c = a+b+s;
		return c;
	}

}
