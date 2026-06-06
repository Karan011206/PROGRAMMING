package sheet3;

public class Twodarraysheet3 
{
	static void printSpiral(int[][] a) 
	{
        if (a == null || a.length == 0) return;

        int top = 0, left = 0;
        int bottom = a.length - 1;
        int right = a[0].length - 1;

        while (top <= bottom && left <= right) {
            // top row
            for (int j = left; j <= right; j++) System.out.print(a[top][j] + " ");
            top++;

            // right column
            for (int i = top; i <= bottom; i++) System.out.print(a[i][right] + " ");
            right--;

            // bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) System.out.print(a[bottom][j] + " ");
                bottom--;
            }
         // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(a[i][left] + " ");
                left++;
            }
        }
    }

	
	
	static void printSpiralAntiClockwise(int[][] b) {
        if (b == null || b.length == 0) return;

        int top = 0, left = 0;
        int bottom = b.length - 1;
        int right = b[0].length - 1;

        while (top <= bottom && left <= right) {
            // left column (top -> bottom)
            for (int i = top; i <= bottom; i++) System.out.print(b[i][left] + " ");
            left++;

            // bottom row (left -> right)
            if (left <= right) {
                for (int j = left; j <= right; j++) System.out.print(b[bottom][j] + " ");
                bottom--;
            }
            // right column (bottom -> top)
            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) System.out.print(b[i][right] + " ");
                right--;
            }

            // top row (right -> left)
            if (left <= right) {
                for (int j = right; j >= left; j--) System.out.print(b[top][j] + " ");
                top++;
            }
        }
    }

	
	
	public static void main(String[] args) 
	{
		
		int[][] a = {
	            { 1,  2,  3,  4 },
	            { 5,  6,  7,  8 },
	            { 9, 10, 11, 12 },
	            {13, 14, 15, 16 }
	        };

	        printSpiral(a);
	        
	     System.out.println();   
	        int[][] b= {
	                { 1,  2,  3,  4 },
	                { 5,  6,  7,  8 },
	                { 9, 10, 11, 12 },
	                {13, 14, 15, 16 }
	            };

	            printSpiralAntiClockwise(a);
	        
	    }

	}

