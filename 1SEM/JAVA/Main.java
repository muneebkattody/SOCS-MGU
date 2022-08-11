// ODD OR EVEN

import java.util.*;  
import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix");
        int m = in.nextInt();
        System.out.println("Enter the number of columns of the matrix");
        int n = in.nextInt();

        // Declare the matrix
        int matrix[][] = new int[m][n];

        // Read the matrix values
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = in.nextInt();
                
        System.out.println("Elements of the matrix are");
         
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + "  ");
            System.out.println();
        }
        
        int odd=0, even=0;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(matrix[i][j]%2==0)
                    even++;
                else
                    odd++;
            }
        }
        
        System.out.println("Odd = "+odd+ " Even = "+ even);
}
}
