package codeForces;

import java.util.Scanner;

public class Problem_282A_Bit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n+1];
        int x = 0;

        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
            if(s[i].equals("X++"))
            {
                x++;
            }
            else if(s[i].equals("++X"))
            {
                x++;
            }
            else if(s[i].equals("X--"))
            {
                x--;
            }
            else if(s[i].equals("--X"))
            {
                x--;
            }
        }
        System.out.println(x);
    }
}
