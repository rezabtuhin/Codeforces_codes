/*
* @author Rezab Ud Dawla
* created at: 17:45 03/15/2021
 */
import java.util.Arrays;
import java.util.Scanner;

public class Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String temp = s1+s2;
        char[] c1 = temp.toCharArray();
        char[] c2 = s3.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String f1 = Arrays.toString(c1);
        String f2 = Arrays.toString(c2);
        if(f1.equals(f2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
