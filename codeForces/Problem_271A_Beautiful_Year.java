package codeForces;

import java.util.Scanner;

public class Problem_271A_Beautiful_Year
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c,d;
        int y = s.nextInt();
        while(true){
            y = y+1;
            a = y/1000;
            b = y/100%10;
            c = y/10%10;
            d = y%10;

            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                break;
            }
        }
        System.out.println(y);
    }
}
