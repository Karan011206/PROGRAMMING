package bitmamipulation;

public class Setbit {
	public static void bitq1() 
	{
		int n = 15; 
		int count = Integer.bitCount(n); 
		System.out.println("Set bits: " + count);
	}

	//using while and shift right 
	public class CountSetBits {
	    public static int countSetBits() {
	    	int  number = 13; 
	       
	    
	        int count = 0;
	        
	        while (number > 0) {
	           
	            number&= (number - 1); 
	            count++;
	            System.out.println("Set bits in " + number + ": " + countSetBits());
	        }
	        return count;
	    }
	    
	    
	    
	    public static void twopower() {
	    	   int number = 16; 
	           int temp = number;

	           if (number <= 0) {
	               System.out.println(number + " is not a power of 2.");
	               return;
	           }

	         
	           while (number % 2 == 0) {
	               number = number / 2;
	           }

	      
	           if (number == 1) {
	               System.out.println(temp + " is a power of 2.");
	           } else {
	               System.out.println(temp + " is not a power of 2.");
	           }
	       }
	   
	    public static int twice() {
	    	int [] arr = {1,2,3,2,3,4,5,6};
	    	int result = 0;
	    	for(int num : arr)
	    	{
	    		result ^=num;
	    	}
	    	return result;
	    }
//swap two varibales using third variable 
	    public static void swap() {
	    	
	    }
	public static void main(String[] args) {
		bitq1();
		countSetBits();
		twopower();
	}

}
}

