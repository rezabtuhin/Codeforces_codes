/*
* @author Rezab Ud Dawla
* created at: 17:23 03/15/2021
 */
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

public class candies_and_two_sister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int testCase = sc.nextInt();
        for(int i = 0;i<testCase;i++){
            int x = sc.nextInt();
            if(x<=2){
                System.out.println("0");
            }
            else if(x%2 == 0){
                System.out.println((x/2) - 1);
            }
            else{
                System.out.println(x/2);
            }
        }
    }
}
