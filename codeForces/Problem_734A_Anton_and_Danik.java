package codeForces;

import java.util.Scanner;

public class Problem_734A_Anton_and_Danik
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int matchPlayed = sc.nextInt();
        int anton = 0,danik = 0;
        String s = sc.next();
        char[] x = s.toCharArray();
        for(int i = 0;i<matchPlayed;i++){
            if(x[i] == 'A'){
                anton++;
            }
            else{
                danik++;
            }
        }
        if(anton>danik){
            System.out.println("Anton\n");
        }
        else if(anton == danik){
            System.out.println("Friendship\n");
        }
        else{
            System.out.println("Danik\n");
        }
    }
}
