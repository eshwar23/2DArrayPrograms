
/**
 * Write a description of class MarkovMatrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
class MarkovMatrix
{
    double arr[][];
    int n;
    void input()
    {
        int i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        n=in.nextInt();
        arr=new double[n][n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the values of the row "+(i+1));
            for(j=0;j<n;j++)
            {
                arr[i][j]=in.nextDouble();
            }
        }
    }
    void CheckMarkovMatrix()
    {
        int i , j ,k=0,res=0;
        double sumrow=0,sumcol=0;
        for(i=0;i<n;i++)
        {
            sumrow=0;sumcol=0;
            for(j=0;j<n;j++)
            {
                sumrow=sumrow+arr[i][j];
                sumcol=sumcol+arr[j][i];
                System.out.print (arr[i][j]+"\t");
                if(arr[i][j]<0)
                {
                    k=1;
                }
            }
            System.out.println();
            if(sumrow==1.0d && sumcol==1.0d)
            {
                continue ;
            }
            else
            {
                res=1  ;
            }
        }
        if(k==1)
        {
            System.out.println("Invalid Matrix - Negative numbers entered");
        }
        else if(res==1)
        {
            System.out.println("Not a MarkovMatrix");
        }
        else
        {
            System.out.println("Markov Matrix");
        }
    }
    public static void main()
    {
        MarkovMatrix obj=new MarkovMatrix();
        obj.input();
        obj.CheckMarkovMatrix();
    }
}
