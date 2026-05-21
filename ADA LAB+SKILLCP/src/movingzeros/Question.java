package movingzeros;

public class Question {
	public static void q1() {

	    int arr[] = {0,2,4,0,5,0,1,3};

	    int index = 0;

	    for(int i = 0; i < arr.length; i++) {

	        if(arr[i] != 0) {

	            int temp = arr[index];
	            arr[index] = arr[i];
	            arr[i]= temp;
	            index++;
	        }
	    }

	    for(int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}
	
	

    public static void moveZeroes(int[] arr1) {
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                arr1[j++] = arr1[i];
            }
        }

        for (; j < arr1.length; j++) {
            arr1[j] = 0;
        }
    }
    
    
    
    public static void similarelements1() {
    	int[] arr = {2, 2, 3, 3, 4, 4, 5};
    	boolean flag = false;
    	for (int i = 0; i < arr.length; i++) {

    	    

    	    for (int j = i + 1; j < arr.length; j++) {
    	        if (arr[i] == arr[j]) {
    	            flag = true;
    	        }
    	    }

    	    if (!flag) 
    	    {
    	        System.out.print(arr[i] + " ");
    	    }
    	}}
     
   

        static void multiplyExceptSelf() {
        	int[] arr= {2,3,4,5};

            for (int i = 0; i < arr.length; i++) {

                int mul = 1;

                for (int j = 0; j < arr.length; j++) {

                    if (i!= j) {
                        mul = mul * arr[j];
                    }
                }

                System.out.print(mul + " ");
            }
        }
	public static void main(String[] args) {
		//q1();
//		int arr1[]= {0,2,4,0,5,0,1,3};
//		moveZeroes(arr1);
//
//        for (int num : arr1) {
//            System.out.print(num + " ");
//	}
        similarelements1();
	}
}
	
	
