package test2darray;

import java.util.Scanner;

public class Test 
{
	
	
	

	public static void q1()
	{
		int[][] arr = {
				{1, 2, 3}, 
				{4, 5, 6},
				{7, 8, 9} 
				};
		System.out.println("question 1");
		for(int i =0;i<arr[0].length;i++)
		{
			for(int c=0;c<arr[i].length;c++)
			{
				System.out.print(arr[i][c]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void q2()
	{
		int[][] arr = {
				{1, 2, 3}, 
				{4, 5, 6},
				{7, 8, 9} 
				};
		System.out.println("question 2");
		for(int i =0;i<arr[0].length;i++)
		{
			if(i==0||i==arr.length-1)
			{
				
			
			for(int c=0;c<arr[i].length;c++)
			{
				System.out.print(arr[i][c]+" ");
			}
			}
			System.out.println();
		}
	}
	
	public static void q3()
	{
		int[][] arr = {
				{1, 2, 3}, 
				{4, 5, 6},
				{7, 8, 9} 
				};
		System.out.println("question 3");
		for(int i =0;i<arr[0].length;i++)
		{
			
			
				
			
			for(int c=0;c<arr[i].length;c++)
			{
				if(c==0||c==arr.length-1)
				{
				System.out.print(arr[i][c]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void q4()
	{
		int[][] arr = {
				{1, 2, 3}, 
				{4, 5, 6},
				{7, 8, 9} 
				};
		System.out.println("question 4");
		for(int i =0;i<arr[0].length;i++)
		{
			
			
				
			
			for(int c=0;c<arr[i].length;c++)
			{
				if(i==c||i+c==2)
				{
				System.out.print(arr[i][c]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void q5()
	{
		int[][] arr = {
				{1, 2, 3}, 
				{4, 5, 6},
				{7, 8, 9} 
				};
		System.out.println("question 5");
		for(int i =0;i<arr[0].length;i++)
		{
			
			
				
			
			for(int c=0;c<arr[i].length;c++)
			{
				if(i>c)
				{
				System.out.print(arr[i][c]+" ");
				}
			}
			System.out.println();
		}
	}
	

	public static void q6()
	{
		int[][] arr = {
				{1, 2, 3}, 
				{4, 5, 6},
				{7, 8, 9} 
				};
		System.out.println("question 6");
		for(int i =0;i<arr[0].length;i++)
		{
			
			
				
			
			for(int c=0;c<arr[i].length;c++)
			{
				if(c>i)
				{
				System.out.print(arr[i][c]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void q7()
	{
		int[][] arr = {
				{12, 5, 18}, 
				{7, 16, 23},
				{20, 30, 45} 
				};
		System.out.println("question 7");
		for(int i =0;i<arr[0].length;i++)
		{
			
			
				
			
			for(int c=0;c<arr[i].length;c++)
			{
				if(arr[i][c]%2==0)
				{
				System.out.print(arr[i][c]+" ");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void q8()
	{
		int[][] arr = {
				{1, 2, 3}, 
				{4, 5, 6},
				{7, 8, 9} 
				};
		System.out.println("question 8");
		for(int i =0;i<arr[0].length;i++)
		{
			for(int c=0;c<arr[i].length;c++)
			{
				System.out.print(arr[i][c]*10+" ");
			}
			System.out.println();
		}
	}
	 
	public static void q9()
	{
		System.out.println("question 9");
		 int[][] arr = {
				 {5, -2, 3},
				{-4, 7, -1},
				{8, -9, 10}
				};
		 for(int i =0;i<arr.length;i++)
		 {
			 for(int c=0;c<arr[i].length;c++)
			 {
				 if(arr[i][c]<0)
				 {
					 System.out.print(arr[i][c]=0);
				 }
				 else
				 {
					 System.out.print(arr[i][c]+" ");
				 }
			 }
			 System.out.println();
		 }
	}
	
	
	
	
		
		
		public static void q10()
		{
			System.out.println("solution of q10");
			
			int[][] arr = { 
					{15, 25, 35},
					{40, 50, 60},
					{70, 80, 90} 
					};
			int n = arr.length;
			
			int[] temp = arr[0]; 
		    arr[0] = arr[n - 1];
		    arr[n - 1] = temp;

		    
		    for (int r = 0; r < n; r++)
		    {
		        for (int c = 0; c < arr[r].length; c++) 
		        {
		            System.out.print(arr[r][c] + " ");
		        }
		    }
		    System.out.println();
		}
		
		
		public static void q11()
		{
			System.out.println("solution of q11");
			int[][] arr = { 
					{15, 25, 35},
					{40, 50, 60},
					{70, 80, 90} 
					};
			int n = arr.length;
			int m = arr[0].length;
			
			for(int r=0;r<n;r++)
			{
				for(int c=0;c<m;c++)
				{
					System.out.print(arr[r][c]+" ");
				}
				System.out.println();
			}
			
			
		}
		
		public static void q12()
		{
			System.out.println("solution of q12");
			
			int[][] arr = { 
					{12, 5, 8},
					{22, 11, 18},
					{9, 25, 16}
					};
			
			
			 System.out.println("Original Array:");
			    for(int i = 0; i < arr.length; i++)
			    {
			        for(int c = 0; c < arr[i].length; c++) 
			        {
			            System.out.print(arr[i][c] + " ");
			        }
			        System.out.println();
			    }
			    
			    System.out.println("sorted Array");
			for(int r = 0; r < arr.length; r++) 
			{
		       
		        for(int i = 0; i < arr[r].length - 1; i++) 
		        {
		            for(int j = 0; j < arr[r].length - 1 - i; j++) 
		            {
		                if(arr[r][j] > arr[r][j + 1]) 
		                {
		                    
		                    int temp = arr[r][j];
		                    arr[r][j] = arr[r][j + 1];
		                    arr[r][j + 1] = temp;
		                }
		            }
		        }
		    }
			
			for(int r = 0; r < arr.length; r++) {
		        for(int c = 0; c < arr[r].length; c++) {
		            System.out.print(arr[r][c] + " ");
		        }
		        System.out.println();
		    }
		}
		
		public static void q13()
		{
			System.out.println("question 13");
		    
		    int[][] arr = { 
		        {12, 5, 8},
		        {22, 11, 18},
		        {9, 25, 16}
		    };
		    
		    
		    System.out.println("Original Array:");
		    displayArray(arr);
		    
		        
		    int m = arr[0].length; 
		    
		   
		    for(int c = 0; c < m; c++) 
		    {  
		        for(int i = 0; i < arr.length - 1; i++) 
		        {
		            for(int j = 0; j < arr.length - 1 - i; j++) 
		            {
		               
		                if(arr[j][c] > arr[j + 1][c]) 
		                {
		                   
		                    int temp = arr[j][c];
		                    arr[j][c] = arr[j + 1][c];
		                    arr[j + 1][c] = temp;
		                }
		            }
		        }
		    }
		    
		    
		    System.out.println("Array after sorting columns:");
		    displayArray(arr);
		}

		public static void displayArray(int[][] array) {
		    for(int i = 0; i < array.length; i++) {
		        for(int j = 0; j < array[i].length; j++) {
		            System.out.print(array[i][j] + " ");
		        }
		        System.out.println();
		    }
			
			
		}
		
		public static void q14()
		{
			System.out.println("question 14");
			int[][] arr = { 
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9} 
					};
			int sum=0;
			for(int i =0;i<arr.length;i++)
			{
				for(int c=0;c<arr[0].length;c++)
				{
					if(i==c||i+c==arr.length-1)
					{
						sum=sum+arr[i][c];
					}
					
				}
				
			}
			System.out.println(sum);
			
			
		}
		
		public static void q15()
		{
			System.out.println("question 15");
			int[][] arr = { 
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9} 
					};
			int n = arr.length;
			
			for(int r=0;r<n;r++)
			{
				int sum = 0;
				for(int c=0;c<arr[r].length;c++)
				{
				sum=sum+arr[r][c];	
				}
				
				System.out.println(sum);
			}
			
			
			
		}
		
		public static void q16()
		{
			System.out.println("question 16");
			int[][] arr = { 
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9} 
					};
			int n = arr.length;
			int m = arr[0].length;
			
			for(int c=0;c<m;c++)
			{
				int sum = 0;
				for(int r=0;r<n;r++)
				{
					
					sum=sum+arr[r][c];
					
				}
				
				System.out.println(sum);

			}
			
			
		}
		
		
		
		//sheet 2
//		public static void sheet2q1()
//		{
//			scann
//			int arr[][]= {
//				{11, 12, 13},
//				{14, 15, 16},
//				{17, 18, 19}
//				};
//			for(int i=0;i<arr.length;i++)
//			{
//				
//			}
//			
//		}
//
//	
		

		public static void sheet2q1() 
		{
		    {
		        Scanner sc = new Scanner(System.in);
		        
				int c = 0;
				
				int i1 = 0;
				int[][] arr = new int[i1][c];
		        System.out.println("Enter the elements of the array:");
		        for (int i11 = 0; i11 < arr.length; i11++) 
		        {              
		            for (int j = 0; j < i11; j++)
		            {             
		                arr[i11][j] = sc.nextInt();             
		            }
		        }
		        System.out.println();
		    }
		}

		public static void sheet2q2()
		{
		 int A[][]= {
				 {2, 4, 6},
		 
				{8, 10, 12},
				{14, 16, 18} 
				};
			  
			int B[][]={
					{1, 3, 5},
				{7, 9, 11},
				{13, 15, 17} 
				};
			for(int i =0;i<A.length;i++)
			{
				for(int c=0;A<arr[i].length;c++)
				{
					
				}
			}

		}
// public static void q20()
// {
//	 int[][] arr = { 
//			 {15, 32, 9, 18};
//	 
//	 }
// }
	public static void main(String[] args) 
	{
	//q20();	
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
		q13();
		q14();
		q15();
		q16();
		sheet2q1();
	}

}
