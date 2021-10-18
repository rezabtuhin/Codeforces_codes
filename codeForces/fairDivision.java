import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class fairDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test!=0){
            int alice = 0;
            int bob = 0;
            int candies = sc.nextInt();
            Integer[] arr = new Integer[candies];
            for (int i = 0; i < candies; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr,Collections.reverseOrder());
            alice+=arr[0];
            for (int i = 1; i < candies; i++) {
                if (alice!=bob){
                    if (alice>bob){
                        bob+=arr[i];
                    }
                    else{
                        alice+=arr[i];
                    }
                }
                else{
                    alice+=arr[i];
                }
            }
            if (alice != bob)
            {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            test--;
        }
    }
}
