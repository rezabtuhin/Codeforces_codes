package codeForces;

import java.util.Scanner;

public class Problem_977A_Wrong_Subtraction
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int k = reader.nextInt();

        for(int x = 1;x<=k;x++){
            if(n%10!=0){
                n--;
            }
            else{
                n/=10;
            }
        }


        System.out.println(n);
    }
}
