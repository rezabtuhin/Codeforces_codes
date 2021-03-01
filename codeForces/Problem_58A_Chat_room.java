package codeForces;

import java.util.Scanner;

public class Problem_58A_Chat_room
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String sourceString = "hello";
        boolean x = false;
        char[] c1 = sourceString.toCharArray();
        String userString = sc.nextLine();
        char[] c2 = userString.toCharArray();
        int track = 0;
        for(int i = 0;i<userString.length();i++){
            if(c1[track]==c2[i]){
                track++;
                if(track==5){
                    x = true;
                    break;
                }
            }
        }
        if(x){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
