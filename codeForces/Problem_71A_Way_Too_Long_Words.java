package codeForces;

import java.util.Scanner;

public class Problem_71A_Way_Too_Long_Words {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        while(x--!=0){
            s = sc.next();
            if(s.length()>10){
                System.out.print(s.charAt(0));
                System.out.print(s.length()-2);
                System.out.print(s.charAt(s.length()-1));
                System.out.println();
            }
            else{
                System.out.println(s);
            }

        }
    }
}
