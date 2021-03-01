package codeForces;

import java.util.Scanner;

public class Problem_110A_Nearly_Lucky_Number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        String test = Long.toString(x);
        char[] c = test.toCharArray();
        int count = 0;

        for(int i = 0;i<test.length();i++){
            if(c[i] == '4'){
                count++;
            }
            else if(c[i] == '7'){
                count++;
            }
        }
        if(count==4||count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}
