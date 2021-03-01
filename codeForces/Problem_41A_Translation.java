package codeForces;

import java.util.Scanner;

public class Problem_41A_Translation
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        StringBuilder input1 = new StringBuilder(b);
        input1.reverse();
        String x = input1.toString();
        if(a.equals(x)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
