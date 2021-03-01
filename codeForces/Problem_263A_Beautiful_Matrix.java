package codeForces;

import java.util.Scanner;

public class Problem_263A_Beautiful_Matrix
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[6][6];
        int i=0,j=0,r=0,c=0,cnt1=0;

        for(i=1;i<6;i++)
        {
            for(j=1;j<6;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(i=1;i<6;i++)
        {
            for(j=1;j<6;j++)
            {
                if(a[i][j]==1)
                {
                    r = i;
                    c = j;
                }

            }
        }

        if(r==3 && c==3)
        {
            System.out.println(0);
        }

        if(r!=3 || c!=3)
        {
            if(r>3 && c>3)
            {
                while(r!=3)
                {
                    r--;
                    cnt1++;
                }
                while(c!=3)
                {
                    c--;
                    cnt1++;
                }
                System.out.println(cnt1);
            }
            cnt1 = 0;
            if(r>3 && c<3)
            {
                while(r!=3)
                {
                    r--;
                    cnt1++;
                }
                while(c!=3)
                {
                    c++;
                    cnt1++;
                }
                System.out.println(cnt1);
            }
            cnt1 = 0;
            if(r<3 && c>3)
            {
                while(r!=3)
                {
                    r++;
                    cnt1++;
                }
                while(c!=3)
                {
                    c--;
                    cnt1++;
                }
                System.out.println(cnt1);
            }
            cnt1 = 0;
            if(r<3 && c<3)
            {
                while(r!=3)
                {
                    r++;
                    cnt1++;
                }
                while(c!=3)
                {
                    c++;
                    cnt1++;
                }
                System.out.println(cnt1);
            }
            cnt1 = 0;
            if(r==3 && c!=3)
            {
                if(c>3)
                {
                    while(c!=3)
                    {
                        c--;
                        cnt1++;
                    }
                    System.out.println(cnt1);
                }
                if(c<3)
                {
                    while(c!=3)
                    {
                        c++;
                        cnt1++;
                    }
                    System.out.println(cnt1);
                }
            }
            cnt1 = 0;
            if(r!=3 && c==3)
            {
                if(r>3)
                {
                    while(r!=3)
                    {
                        r--;
                        cnt1++;
                    }
                    System.out.println(cnt1);
                }
                if(r<3)
                {
                    while(r!=3)
                    {
                        r++;
                        cnt1++;
                    }
                    System.out.println(cnt1);
                }
            }

        }
    }
}
