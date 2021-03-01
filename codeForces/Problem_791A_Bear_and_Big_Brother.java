package codeForces;

import java.util.Scanner;

public class Problem_791A_Bear_and_Big_Brother
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weightL = sc.nextInt();
        int weightB = sc.nextInt();
        int yearCount = 0;
        if(weightL<=weightB){
            while(weightL<=weightB){
                weightL = weightL*3;
                weightB = weightB*2;
                yearCount++;
            }
        }
        else{
            System.out.println("0");
        }
        System.out.println(yearCount);
    }
}
