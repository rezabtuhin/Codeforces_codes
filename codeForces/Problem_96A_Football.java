package codeForces;

import java.util.Scanner;

public class Problem_96A_Football
{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String s = reader.nextLine();
        if(s.contains("1111111") || s.contains("0000000")){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
