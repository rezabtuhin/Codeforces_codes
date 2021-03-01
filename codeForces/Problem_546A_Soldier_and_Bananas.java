package codeForces;

import java.util.Scanner;

public class Problem_546A_Soldier_and_Bananas
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();           //cost of banana
        int n = sc.nextInt();           //Dollars solider have
        int w = sc.nextInt();           //No of banana he wants
        int cost = 0;
        int due = 0;
        for(int i = 1;i<=w;i++){
            cost = cost+(k*i);
        }
        if(cost>n){
            due = cost-n;
            System.out.println(due);
        }
        else{
            System.out.println("0");
        }

    }
}
