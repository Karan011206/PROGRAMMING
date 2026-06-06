package twodarray;

import com.sun.accessibility.internal.resources.accessibility;

public class Sheet2 
{
	public static void q1()
	{
		System.out.println("solution of q1");
		int [][]arr = {
	            {11, 12, 13},
	            {14, 15, 16},
	            {17, 18, 19}
	        }; 	       
		int target = 16;

	        boolean found = false;
	        int fr = -1, fc = -1;

	        for (int r = 0; r < arr.length; r++) {                // rows 
	            for (int c = 0; c < arr[r].length; c++) {         // cols of row r 
	                if (arr[r][c] == target) {
	                    System.out.println("Element " + target + " found at index:[" + r + "][" + c + "]"); // [attached_file:118]
	                    return; // stop after finding first occurrences
	                }
	            }
	        }
	        System.out.println("Element not found");

	}
	
	
	public static void q2()
	{
		System.out.println("solution of q2");
		int[][] A = {
	            {2, 4, 6},
	            {8, 10, 12},
	            {14, 16, 18}
	        }; // Matrix A 

	        int[][] B = {
	            {1, 3, 5},
	            {7, 9, 11},
	            {13, 15, 17}
	        }; // Matrix B 

	        int r = A.length, c = A[0].length;
	        int[][] S = new int[r][c];
	        for (int i = 0; i < r; i++)
	            for (int j = 0; j < c; j++)
	                S[i][j] = A[i][j] + B[i][j]; // element-wise sum 

	        // Expected output:
	        // 3 7 11
	        // 15 19 23
	        // 27 31 35 
	        for (int i = 0; i < r; i++) {
	            for (int j = 0; j < c; j++)
	                System.out.print(S[i][j] + (j + 1 == c ? "" : " "));
	            System.out.println();
	        }
	    }
		
	
	
	public static void q3()
	{
		System.out.println("soluton of q3");
		 int[][] A = {
		            {15, 20, 25},
		            {30, 35, 40},
		            {45, 50, 55}
		        }; // A 
		        int[][] B = {
		            {5, 10, 15},
		            {10, 15, 20},
		            {15, 20, 25}
		        }; // B 

		        int r = A.length, c = A[0].length;
		        int[][] D = new int[r][c];
		        for (int i = 0; i < r; i++)
		            for (int j = 0; j < c; j++)
		                D[i][j] = A[i][j] - B[i][j]; // A - B

		        // Expected:
		        // 10 10 10
		        // 20 20 20
		        // 30 30 30 [attached_file:118]
		        for (int i = 0; i < r; i++) {
		            for (int j = 0; j < c; j++)
		                System.out.print(D[i][j] + (j + 1 == c ? "" : " "));
		            System.out.println();
		        }
	}
	
	public static void q4()
	{
		System.out.println("solution of q4");
		
		
	}
		
	
	public static void q5()
	{
		System.out.println("solution of q5");
		int[][] a = {
	            {10, 20, 30, 40},
	            {50, 60, 70, 80},
	            {90, 100, 110, 120},
	            {130, 140, 150, 160}
	        }; // 4x4 [attached_file:118]

	        // Expected output order:
	        // 10 50 90 130 140 100 60 20 30 70 110 150 160 120 80 40 [attached_file:118]

	        int r = a.length, c = a[0].length;
	        StringBuilder sb = new StringBuilder();
	        for (int col = 0; col < c; col++) {
	            if (col % 2 == 0) {
	                for (int row = 0; row < r; row++)
	                    sb.append(a[row][col]).append(' ');
	            } else {
	                for (int row = r - 1; row >= 0; row--)
	                    sb.append(a[row][col]).append(' ');
	            }
	        }
	        System.out.println(sb.toString().trim());
	}
	
	public static void q6()
	{
		System.out.println("solution of q6");
		int[][] a = {
	            {10, 20, 30, 40},
	            {50, 60, 70, 80},
	            {90, 100, 110, 120},
	            {130, 140, 150, 160}
	        }; // 4x4 [attached_file:118]

	        // Expected:
	        // 160 120 80 40 30 70 110 150 140 100 60 20 10 50 90 130 [attached_file:118]

	        int r = a.length, c = a[0].length;
	        StringBuilder sb = new StringBuilder();
	        for (int col = c - 1; col >= 0; col--) {
	            int posFromRight = (c - 1 - col);
	            if (posFromRight % 2 == 0) {
	                for (int row = r - 1; row >= 0; row--)
	                    sb.append(a[row][col]).append(' ');
	            } else {
	                for (int row = 0; row < r; row++)
	                    sb.append(a[row][col]).append(' ');
	            }
	        }
	        System.out.println(sb.toString().trim()); 
	}
	
	public static void q7()
	{
		System.out.println("solution of q7");
		 int[][] a = {
		            {1,  2,  3,  4},
		            {8,  7,  6,  5},
		            {9, 10, 11, 12}
		        }; // arranged to print as in example output order [attached_file:118]

		        // Expected printed sequence:
		        // 1 2 3 4 8 7 6 5 9 10 11 12 [attached_file:118]

		        int r = a.length, c = a[0].length;
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < r; i++) {
		            if (i % 2 == 0) {
		                for (int j = 0; j < c; j++) sb.append(a[i][j]).append(' ');
		            } else {
		                for (int j = 0; j < c; j++) sb.append(a[i][c - 1 - j]).append(' ');
		            }
		        }
		        System.out.println(sb.toString().trim());
	}
	
	
	
	
	
//	public static int[] findExitPoint(int[][] matrix)
//	{
//		System.out.println("solution of q20");
//        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
//        {
//            return new int[]{-1, -1}; 
//        }
//        
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        // Start at the top-left corner
//        int r = 0;
//        int c = 0;
//
//        // Initialize direction: 0: right, 1: down, 2: left, 3: up
//        int direction = 0;
//
//        while (true) 
//        {
//            // If the current element is 1, turn 90 degrees clockwise
//            if (matrix[r][c] == 1)
//            {
//                direction = (direction + 1) % 4;
//            }
//
//            // Move one step in the current direction
//            if (direction == 0)
//            { // Moving right
//                c++;
//            } else if (direction == 1) 
//            { // Moving down
//                r++;
//            } else if (direction == 2)
//            { // Moving left
//                c--;
//            } else 
//            { // Moving up (direction == 3)
//                r--;
//            }
//
//            // Check if the new position is outside the matrix boundaries
//            if (r < 0 || r >= rows || c < 0 || c >= cols)
//            {
//                // If out of bounds, revert the last move to find the exit point
//                if (direction == 0)
//                {
//                    c--;
//                } else if (direction == 1)
//                {
//                    r--;
//                } else if (direction == 2) 
//                {
//                    c++;
//                } else { // direction == 3
//                    r++;
//                }
//                // Return the last valid position
//                return new int[]{r, c};
//            }
//        }
	
	public static void q15()
	{
		for(int i=0;i<a.length;i++)
		{
			
		}
	}
	
	
	public static void main(String[] args) 
	{
		q11();
//		int[][] matrix = {
//	            {0, 1, 0, 0},
//	            {0, 0, 1, 0},
//	            {1, 0, 0, 0},
//	            {0, 0, 0, 0}
//	        };
//
//	        int[] exitPoint = findExitPoint(matrix);
//	        System.out.println("Exit Point: (" + exitPoint[0] + ", " + exitPoint[1] + ")");
	}

}
