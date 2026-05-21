package matrixmultiplication;
public class Matrix {
    public static void main(String[] args) {
        
        int[][] A = { {1, 2}, 
        		      {4, 5} };
        int[][] B = { {7, 8},
        		      {9, 10} };

       
        int r1 = A.length;                                  
        int c1 = A[0].length; 
        int c2 = B[0].length; 

        int[][] product = new int[r1][c2];

        
        for (int i = 0; i < r1; i++) { 
            for (int j = 0; j < c2; j++) { 
                for (int k = 0; k < c1; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        
        System.out.println("Result:");
        for (int ) 
        {
            for () 
            {
            	 int p = (A[0][0]+A[1][1])*(B[0][0]+B[1][1]);
            	 int q = (A[1][0]+A[1][1])*(B[0][0]);
            	 int r = (A[0][0])*(B[0][1] - B[1][1]
            	
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
