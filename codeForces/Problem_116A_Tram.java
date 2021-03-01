package codeForces;

import java.util.Scanner;

public class Problem_116A_Tram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int a[] = new int[1000];
        int b[] = new int[1000];
        int max = 0;
        for(i=0;i<n;i++)
        {
            if(i==0)
            {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
            else
            {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                b[i] = b[i]+b[i-1]-a[i];
            }
        }

        for(i=0;i<n-1;i++)
        {
            if(b[i]>max)
            {
                max = b[i];
            }
        }
        System.out.println(max);

    }
}
