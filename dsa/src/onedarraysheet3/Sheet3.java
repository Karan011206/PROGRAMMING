package onedarraysheet3;

public class Sheet3
{
	public static void q1()
	{
		int arr[]= {1, -10, 20, -30, 5};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int multy=(arr[i]*arr[j]);
				if(multy>max)
				{
					max=multy;
					
				}
			}
			System.out.println(max);
		}
	}
	
	public static void allsubarrayq3()
	{
		int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
		

	}
	
	
	public static void sumofelementsq6()
	{
		
	}
	public static void findmissingtermq6(int nums[])
	{
	 // int nums[]= {1, 2, 2, 4, 5};
	  int n =nums.length;
	  int sum = n*(n+1)/2;
	  System.out.println(sum);
	  int findmissingtermq6 =sum -sumofelementsq6(nums);
	  return findmissingtermq6;
	}
	public static void main(String[] args) 
	{
		q1();
		
		allsubarrayq3();
		 int nums[]= {1, 2, 2, 4, 5};
		findmissingtermq6();
	}

}
