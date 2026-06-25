package primenumber;

public class Smallestprimefactor {
	public static void divisors() 
	{
		System.out.println("divisors");
		int num = 100;
		for(int i = 1 ; i <= num ; i++) 
		{
			if(num%i == 0) 
			{
				System.out.print(i + ", ");
			}
		}
	}
public static void lesscomplexity()
{
	System.out.println("divisors");
	int num = 100;
	
}
//wrtie a program to print all the number upto n with exactly 3 divisors
	public static void main(String[] args) {
		divisors();
		lesscomplexity();
	}

}
