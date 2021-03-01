package codeForces;

import java.util.Scanner;

public class Problem_4A_Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        if(y == 2){
            System.out.println("No");
        }
        else if(y%2 == 0){
            System.out.println("Yes");
        }

        else{
            System.out.println("No");
        }
    }
}
