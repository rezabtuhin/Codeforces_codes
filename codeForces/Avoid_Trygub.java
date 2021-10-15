/*
* @author Rezab Ud Dawla
*/

import java.util.Arrays;
import java.util.Scanner;

public class Avoid_Trygub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i = 0;i<testcase;i++){
            int numb = sc.nextInt();
            String original = sc.next();
            char[] chars = original.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            System.out.println(sorted);
        }
    }
}
