package recursion;



public class Recurrsionmain 
{
	public static void increasing(int n )
	{
		if(n<1)
		{
			return;
		}
		
	increasing(n-1);
	System.out.print(n + " ");
	
		
	}
	public static void Decreasing(int n )
	{
		if(n<1)
		{
			return;
		}
		
	
	System.out.print(n + " ");
	Decreasing(n-1);
		
	}
	
	
	public static int factorial(int num ) 
	{
		if(num==1)
		{
			return 1;
		}
		return factorial(num-1)*num;
		
	}
	public static double pow(double x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		if(n<0)
		{
			n= Math.abs(n);
			return 1/pow(x, n-1)*1/x;
		}
		else 
		{
			return pow(x, n-1)*x;
		}
	}
	public static void main(String[] args) 
	{
		int num=5;
		System.out.println((factorial(num)));
		
//		int n =3;
//		increasing(n);
//		Decreasing(n);
//		
		double x=3.0;
		int n=2;
	}

}



