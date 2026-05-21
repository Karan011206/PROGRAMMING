package arrayskillenhancement;

import java.util.Arrays;

public class Skill1{
	
	public static void q2() {
		int arr1[]= {1,2,3,4};
		Arrays.sort(arr1);
		
	for (int i = 0; i < arr1.length - 1; i+=2) {
	        int temp = arr1[i];
	        arr1[i] = arr1[i + 1];
	        arr1[i + 1] = temp; 
		
	}
	System.out.println(Arrays.toString(arr1));
	}
	
	public static void optimize() {
		int arr1[]= {1,2,3,4};
		Arrays.sort(arr1);
		
	}
	
	
	
public static void q1() {
	    	    int[] arr1 = {4, 15, 28, 39, 40, 49};
	    	    int[] arr2 = {11, 22, 33, 44, 55,};
	    	    int x = 89;

	    	    int i = 0;
	    	    int j = arr2.length - 1;

	    	    int diff = Integer.MAX_VALUE;
	    	    int[] p = {-1, -1};

	    	    while (i < arr1.length && j >= 0) {
	    	        int sum = arr1[i] + arr2[j];
	    	        int curr = Math.abs(sum - x);

	    	        if (curr < diff) {
	    	            diff = curr;
	    	            p[0] = arr1[i];
	    	            p[1] = arr2[j];
	    	        }

	    	        if (sum > x) {
	    	            j--;
	    	        } else {
	    	            i++;
	    	        }
	    	    }

	    	    System.out.println("Closest pair: " + p[0] + ", " + p[1]);
	    	}



//the array multiplication of two array to multiple and give result instead of that array 
 public static void q3() {
	
		    

		        int arr[] = {1, 2, 3, 4};

		        for (int i = 0; i < arr.length; i++) {

		            int product = 1;

		            for (int j = 0; j < arr.length; j++) {

		                if (i != j) {
		                    product = product * arr[j];
		                }
		            }

		            System.out.print(product + " ");
		        }
		    }
  
	    public static void simplified() {

	        int arr[] = {1, 2, 3, 4};
	        int n = arr.length;

	        int result[] = new int[n];

	        int left = 1;

	      
	        for (int i = 0; i < n; i++) {
	            result[i] = left;
	            left = left * arr[i];
	        }

	        int right = 1;

	        for (int i = n - 1; i >= 0; i--) {
	            result[i] = result[i] * right;
	            right = right * arr[i];
	        }

	      
	        for (int i = 0; i < n; i++) {
	            System.out.print(result[i] + " ");
	        }
	    }

	    
	    //BITONIC ARRAY
	    
	 

	        public static void bitonic() {

	            int arr[] = {2, 4, 6, 8, 10, 7, 5, 3};
	            int max = arr[0];

	            for (int i = 1; i < arr.length; i++) {
	                if (arr[i] > max) {
	                    max = arr[i];
	                }
	            }

	            System.out.println("Bitonic Point: " + max);
	        }

	       //now with less time complexity
	        public static void bitonicsimplified() {

	            int arr[] = {2, 4, 6, 8, 10, 7, 5, 3};
	            int max = arr[0];   
	        }public class BitonicPoint {

	            public static void bitonic() {

	                int arr[] = {2, 4, 6, 8, 10, 7, 5, 3};

	                int low = 0;
	                int high = arr.length - 1;

	                while (low <= high) {

	                    int mid = (low + high) / 2;

	                   
	                    if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
	                        (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {

	                        System.out.println("Bitonic Point: " + arr[mid]);
	                        return;
	                    }

	                  
	                    if (arr[mid] < arr[mid + 1]) {
	                        low = mid + 1;
	                    }
	                   
	                    else {
	                        high = mid - 1;
	                    }
	                }
	            }

	      //most frequent element in array
	            
	       //kruskals algorithm
	            public static void krishkals() {
	            	
	            }
public static void main(String[] args) {
	//q1();
	//q2();
	//optimize();
//	q3();
//	simplified();
	//bitonic();
	//bitonicsimplified();
}
}}
