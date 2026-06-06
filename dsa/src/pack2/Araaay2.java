package pack2;



public class Araaay2 
{
	
	public static void q1swap(int[] arr, int i, int j)
	{
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		for (int k = 0; k < arr.length; k++) {
		    System.out.print(arr[k] + " ");
		}
		System.out.println();
	}
	
	public static void  q8()
	{
		int max =Integer.MIN_VALUE;
		int maxIndex=-1;
		for(int i=0;i<arr.length;i++)
		{
			
		}
		
	}
	public static int q26(int[]a)
	{
		
		int fnr = 0;
		for(int i = 0;i<a.length;i++)
		{
			int count = 1;
			boolean flag = true;
			for(int j = i+1 ; j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					count++;
					flag = false;
					break;
				}
			}
			
			if(flag)
			{
			  fnr = a[i];
			  break;
			}
		}
		return fnr;
	}
	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50};
		q1swap(arr, 1, 3);
		
//		int  [] a = {-1, 2, -1, 3, 0};
//		System.out.println(q26(a));
		
		
	}

}
