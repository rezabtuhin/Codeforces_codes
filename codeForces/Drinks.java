/**
 * 
 * @author Rezab Ud Dawla 
 * created at 10/14/2021 10:41 AM
 *
 **/


import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double sum = 0.0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum = sum+x;
        }
        System.out.println(String.format("%.12f",(sum/n)));
    }
}
