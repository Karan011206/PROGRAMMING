package pack3;



public class TwoDarray 
{
	public static void q1()
	{
		System.out.println("question 1 ");
		int [][]arr=
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}
					
			};
		for(int i=0;i<arr[0].length ;i++) 
		{
			for(int val: arr[i])
			{
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}
	
	public static void q2()
	{
		System.out.println("question 2");
		int [][]arr=
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}
					
			};
		for(int i =0;i<arr.length ;i++)
		{
			 if (i == 0 || i == arr.length-1 )
			{
				for(int c=0;c<arr[i].length;c++) 
				{
					System.out.print(arr[i][c]+" ");
				}
				
			}
			
		}
			System.out.println();
		}

	
	public static void q3()
	{
		System.out.println("question 3");
		int [][]arr=
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}
					
			};
		for(int i=0;i<arr.length;i++) 
		{
			for(int c=0;c<arr[i].length;c++)
			{
				if(c==1||c==arr.length)
				{
					continue;
				}
				else 
				{
					System.out.print(arr[i][c]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void q4()
	{
		System.out.println("question 4");
		int [][]arr=
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}
					
			};
		for(int i =0 ;i<arr.length;i++)
		{
			for(int c=0;c<arr[i].length;c++)
			{
				if(i==c||i+c==2)
				{
					System.out.print(arr[i][c]+" ");
				}
				else 
				{
					continue;
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
		for(int i=0;i<arr.length;i++)
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
		System.out.println("question 6");
		int[][] arr = {
				{1, 2, 3}, 
				{4, 5, 6},
				{7, 8, 9} 
				};
		for(int i=0;i<arr.length;i++)
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
		System.out.println("question 7");
		
	}
	public static void q10()
	{
		int [][]arr=
			{
					{15,25,35},
					{40,50,60},
					{70,80,90}
					
			};	
		
	}
	public static void q15()
	{
		System.out.println("question 15");
		 int[][] arr = { 
				 {1, 2, 3},
				 {4, 5, 6},
				 {7, 8, 9} 
				 };
		 int[][] b=new int[1][3];
		 for(int i =0;i<arr.length-1;i++ )
		 {
			 
		 }
	}
	
	//sheet 2
	//question 1 
	public static void sheet2q1()
	{
		
	}
	
	
	public static void anticlockwiseouterboundary(int a[][])
	{
		System.out.println("solu ");
		//left boundary
		for(int r=0;r<a.length-1;r++)
		{
			System.out.print(a[0][0]+" ");
		}
		//bottom
	
	}
	
	public static void diagonaltraversing(int a[][])
	{
		System.out.println("solu");
	 int maxc=a[0].length-1;
	 int maxr=a.length;
	 int minr =0;
	 int minc =0;
	 for(int k=0;k<=maxc;k++)
	 {
		 for(int i=0, j=k;j<=maxc;i++,j++)
		 {
			 System.out.println(a[i][j]);
		 }
		 
		 
		 for(int i=0, j=k;j<=maxr;i++,j++)
		 {
			 System.out.println(a[i][j]);
		 }
	 }
	}
	public static void main(String[] args) 
	{
//		int [][]arr=
//			{
//					{1,2,3},
//					{4,5,6},
//					{7,8,9}
//					
//			};
//		System.out.print(arr[0][0]+" ");
//		System.out.print(arr[0][1]+" ");
//		System.out.println(arr[0][2]+" ");
//		System.out.print(arr[1][0]+" ");
//		System.out.print(arr[1][1]+" ");
//		System.out.println(arr[1][2]+" ");
//		System.out.print(arr[2][0]+" ");
//		System.out.print(arr[2][1]+" ");
//		System.out.print(arr[2][2]+" ");
		
		//this is shorter method to make an array and fill the desired value without using the for loop using array.fill
		
		
//		int[]a= new int[4];
//		Arrays.fill(a, Integer.MAX_VALUE);
//		a[0]=0;
//		System.out.println(Arrays.toString(a));
		
		
		//q1();
//		q2();
//		q3();
//		q4();
//		q5();
//		q6();
//		q10();
//		q15();
//		sheet2q1();

		int[][] a={
				{1, 2, 3, 4, 5}, 
				{8, 9, 1, 1, 8},
				{5, 6, 7, 1, 3},
				{2, 3, 4, 5, 4},
				{1, 4, 9, 6, 5}
				};
		//anticlockwiseouterboundary(a);
		
		diagonaltraversing(a);
	}

}
