package arrray;



public class Arrray1
{
	
	public static void q1()
	{
		System.out.println("q1");
		int[]arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void q2arraytraversing()
	{
		System.out.println("q2");
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length ;i++)
		{
			System.out.print(arr[i]);
			if(i<arr.length-1)
			{
				System.out.print(" ");
			}
		}

	}
	
	public static void q3reversearraytraversing()
	{
		System.out.println("q3");
		int[] arr= {1,2,3,4,5};
		for(int i=arr.length-1;i>=0 ;i--)
		{
			System.out.print(arr[i]+" ");
			
		}

	}
	public static void q4arraytraversing()
	{
		System.out.println("q4");
		int[] arr= {1,2,3,4,5,6};
		for(int i=0;i<arr.length/2 ;i++)
		{
			System.out.print(arr[i]);
			if(i<arr.length-1)
			{
				System.out.print(" ");
			}
		}

	}
	public static void q5reversearraytraversingendtohalf()
	{
		System.out.println("q5");
		int[] arr= {1,2,3,4,5,6};
		for(int i=arr.length-1;i>arr.length/2-1 ;i--)
		{
			System.out.print(arr[i]+" ");
			
		}

	} 
	
	public static void q6arraytraversinghalftostart()
	{
		System.out.println("q6");
		int[] arr= {1,2,3,4,5,6};
		for(int i=arr.length/2-1;i>=0 ;i--)
		{
			System.out.print(arr[i]+" ");
			
		}

	}	
	public static void q7traversehalftoend()
	{
		System.out.println("q7");
		int[] arr= {1,2,3,4,5,6};
		for(int i=arr.length/2;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void q8minimum()
	{
		System.out.println(" q8");
		int [] arr = {5, 7, 3, 9, 4};
		
		int min = Integer.MAX_VALUE;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
			
			
		}
		System.out.println(min);
		
	}
	public static void q9maxvalue()
	{
		System.out.println(" q9");
		int [] arr = {5, 7, 3, 9, 4};
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
		}
		System.out.println(max);
	}
	
	public static void q10span() 
	{
		System.out.println("q10");
		int [] arr = {5, 7, 3, 9, 4};
		
		int min = Integer.MAX_VALUE;
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
			
			
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
		}
		System.out.println(max-min);
		
	}
	 
	public static void q11()
	{
		System.out.println("q11");	
		int[]arr1= {1, 2, 3, 4};
		int []arr2= {5,6,7,8};
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+" "+arr2[i]);
		}
	}
	public static void q12()
	{
		System.out.println("q12");
		int []arr= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		sum=sum+arr[i];
		
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		q1();
		System.out.println();
		q2arraytraversing();
		System.out.println();
		q3reversearraytraversing();
		System.out.println();
		q4arraytraversing();
		System.out.println();
		q5reversearraytraversingendtohalf();
		System.out.println();
		q6arraytraversinghalftostart();
		System.out.println();
		q7traversehalftoend();
		System.out.println();
		q8minimum();
		System.out.println();
		q9maxvalue();
		System.out.println();
		q10span();
		System.out.println();
		q11();
		System.out.println();
		q12();
	}
}
