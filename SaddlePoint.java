// minimum in row and maximum in column
import java.util.*;
class SaddlePoint
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i , j ,n, min, max, minr,minc,maxr,maxc,k;
        boolean flag=false;
        System.out.println("Enter  the size of the matrix");
        n=in.nextInt();
        int arr[][] = new int[n][n];
        // input the values of the array matrix
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the elements of the array");
                arr[i][j]=in.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            min=arr[i][0];
            minr=i;
            minc=0;
            for(j=0;j<n;j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                    minr=i;
                    minc=j;
                }
            }
            max=arr[0][i];
            maxr=i;
            maxc=minc;
            for(k=0;k<n;k++)
            {
                if(arr[k][minc]>max)
                {
                    max=arr[k][minc];
                    maxr=k;
                    maxc=minc;
                }
            }
            if(max==min && maxr==minr && maxc==minc)
            {
                flag=true;
                System.out.println("Saddle point is "+ max);
                break;
            }
        }
        if(flag==false)
        {
                System.out.println("Saddle point is not present ");
        }
    }
}
            
