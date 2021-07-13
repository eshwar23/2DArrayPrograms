/*Write a program to input values in 4*4 matrix and print the sum of 
 * each row values and each column values.
 */
import java.util.*;
class SumOfEachRowColumn2DMatrix
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        int arr[][]=new int[4][4];
        int i , j ,sr=0, sc=0;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print("Enter a number");
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("The original matrix");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<4;i++)
        {
            sr=0; sc=0;
            for(j=0;j<4;j++)
            {
                sr=sr+arr[i][j];
                sc=sc+arr[j][i];
            }
            System.out.println();
            System.out.println("sum of "+i+"th row is = "+sr);
            System.out.println("sum of "+i+"th column is = "+sc);;
            
        }
    }
}