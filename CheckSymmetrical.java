/*
Write a program to check whether the given n*n matrix is symmetrical or not.
Note: The symmetry of a matrix can only be determined when it is a square matrix.
Logic: To find whether the matrix is symmetric or not we need to compare the original matrix with its transpose matrix. 
if the original matrix and the transpose matrix is same then we call that kind of matrix as symmetrical matrix
Perform the above task using the following instance variables and  functions 

class name :CheckSymmetrical
instance variables
int n - to store the size of the matrix
int i , j - use for loop variables
int arr[][] - array to store the values in the original matrix
int transpose[][] - array to store the transpose of the original matrix arr[][]
Functions/Methods
CheckSymmetrical(int size) - constructor function to  store size to n and initialize the square matrix array arr[ ][ ]
void input() : input the values in array arr[ ][ ]
void print(): print the values of array arr[ ][ ] in matrix form
void transpose() : to store the arr values in the transpose manner (changing row to column and column to rows) in transpose[ ][ ]
boolean CSymmetrical() - return true if the array arr[ ][ ] is symmetrical else return false
public static void main() - input the size of the matrix and call and execute the above member functions to perform the task
 **/
import java.util.*;
class CheckSymmetrical
{
    int n;
    int i , j ;
    int arr[][];
    int transpose[][];
    CheckSymmetrical(int size)
    {
        n=size;
        arr=new int[n][n];
        transpose=new int[n][n];
    }

    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter "+(n*n)+ " values");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println();
    }

    void print()
    {
        System.out.println("Original Matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void transpose()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                transpose[j][i]=arr[i][j];
            }
        }
    }
    boolean CSymmetrical()
    {
        boolean res=true;
        out:
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if (arr[i][j]!=transpose[i][j])
                {
                    res=false;
                    break out;
                }
            }
        }
        return res;
    }
    public static void main()
    {
        int se;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        se=sc.nextInt();
        CheckSymmetrical obj=new CheckSymmetrical(se);
        obj.input();
        obj.print();
        obj.transpose();
        if(obj.CSymmetrical())
        {
            System.out.println("The matrix is Symmetrical");
        }
        else
        {
            System.out.println("The matrix is NOT Symmetrical");
        }
    }
}