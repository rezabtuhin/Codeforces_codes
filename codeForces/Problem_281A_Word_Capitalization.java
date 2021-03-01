package codeForces;

import java.util.Scanner;

public class Problem_281A_Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] x = s.toCharArray();
        x[0] = Character.toUpperCase(x[0]);
        for(int i=0; i<x.length; i++)
            System.out.print(x[i]);
    }
}
