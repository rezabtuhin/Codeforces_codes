package codeForces;

import java.util.Scanner;

public class Problem_122A_Lucky_Division
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        if(x%4 == 0||x%7==0||x%47==0){
            System.out.println("YES");
        }
        else{
            String test = Long.toString(x);
            test = test.replaceAll("4","");
            test = test.replaceAll("7","");
            if(test.length()==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
