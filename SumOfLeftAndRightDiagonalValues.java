import java.util.*;
class SumOfLeftAndRightDiagonalValues
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        int n ,  i , j , sld=0 , srd=0 ;
        System.out.println("Enter the size of the array");
        n=in.nextInt();
        int arr[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("Enter a number");
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("The original matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            sld=sld+arr[i][i];
            srd=srd+arr[i][n-1-i];
        }
        System.out.println("The sum of left diagonal values ="+sld);
        System.out.println("The sum of right diagonal values ="+srd);        
    }
}
/*
 * Enter the size of the array
4
Enter a number1
Enter a number2
Enter a number3
Enter a number4
Enter a number5
Enter a number2
Enter a number3
Enter a number1
Enter a number0
Enter a number5
Enter a number6
Enter a number7
Enter a number4
Enter a number5
Enter a number4
Enter a number3
The original matrix
1 2 3 4 
5 2 3 1 
0 5 6 7 
4 5 4 3 
The sum of left diagonal values =12
The sum of right diagonal values =16
 */